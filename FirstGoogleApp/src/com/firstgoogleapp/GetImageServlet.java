package com.firstgoogleapp;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * GET requests return the promotional image associated with the image with the
 * title specified by the title query string parameter.
 */
public class GetImageServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String title = req.getParameter("title");
        Image image = getImage(title);

        if (image != null && image.getImageType() != null &&
                image.getImage() != null) {
            // Set the appropriate Content-Type header and write the raw bytes
            // to the response's output stream
            resp.setContentType(image.getImageType());
            resp.getOutputStream().write(image.getImage());
        } else {
            // If no image is found with the given title, redirect the user to
            // a static image
            resp.sendRedirect("/static/noimage.jpg");
        }
    }

    /**
     * Queries the datastore for the Image object with the passed-in title. If
     * found, returns the Image object; otherwise, returns null.
     *
     * @param title image title to look up
     */
    private Image getImage(String title) {
        PersistenceManager pm = PMF.get().getPersistenceManager();

        // Search for any Image object with the passed-in title; limit the number
        // of results returned to 1 since there should be at most one image with
        // a given title
        Query query = pm.newQuery(Image.class, "title == titleParam");
        query.declareParameters("String titleParam");
        query.setRange(0, 1);

        try {
            List<Image> results = (List<Image>) query.execute(title);
            if (results.iterator().hasNext()) {
                // If the results list is non-empty, return the first (and only)
                // result
                return results.get(0);
            }
        } finally {
            query.closeAll();
            pm.close();
        }

        return null;
    }
}

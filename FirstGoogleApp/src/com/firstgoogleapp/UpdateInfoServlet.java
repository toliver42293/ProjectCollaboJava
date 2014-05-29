package com.firstgoogleapp;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;


@SuppressWarnings("serial")
public class UpdateInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Entity e;

		try {
			HttpSession session = req.getSession();
			e = ds.get(new Entity("User", (String)session .getAttribute("email")).getKey());
			String field = req.getParameter("field");
			String text = "";
			boolean valid = true;
			if(field.equals("aboutMe"))
				text = req.getParameter("modalTextAboutMe");
			else if(field.equals("hobbies"))
				text = req.getParameter("modalTextHobbies");
			else if(field.equals("interests"))
				text = req.getParameter("modalTextInterests");
			else{
				valid = false;
				text = "";
			}
			
			if(valid){
				e.setProperty(field, text);
				ds.put(e);
			}
			
		} catch (EntityNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}

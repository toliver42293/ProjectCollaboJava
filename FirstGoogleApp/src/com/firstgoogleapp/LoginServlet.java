package com.firstgoogleapp;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String email = req.getParameter("email");
		if(email.isEmpty() || req.getParameter("password").isEmpty()){
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
		}

		HttpSession session = req.getSession();
		if (session.getAttribute("id") != null) {
			// User is logged in
			req.getRequestDispatcher("/WEB-INF/main-loggedin.jsp").forward(req, resp);
		}

		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity e = new Entity("User", email);
		RequestDispatcher dispatch = req.getRequestDispatcher("/WEB-INF/login.jsp");
		boolean acceptLogin = true;

		try {
			// Check if key (email) exists
			if (ds.get(e.getKey()) != null) {
				try {
					if (PasswordHash.validatePassword(
							req.getParameter("password"), ds.get(e.getKey())
									.getProperty("password").toString())) {
						// Passwords match
					} else {
						// Passwords do not match
						acceptLogin = false;
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} catch (EntityNotFoundException e1) {
			// Email not in database
			acceptLogin = false;
		}

		if (!acceptLogin) {
			// Login not accepted
			resp.setContentType("text/plain");
			resp.getWriter()
					.println(
							"<div style='text-align:center; margin:0 auto; padding-top:15px'>");
			resp.getWriter()
					.println(
							"<h4 class='text-danger'>"
									+ "<span class='glyphicon glyphicon-exclamation-sign'></span> Wrong email and password combination</h4>");
			resp.getWriter().println("</div>");
			dispatch.forward(req, resp);
		} else {
			// Login accepted
			try {
				session.setAttribute("email", email);
				session.setAttribute("firstName", ds.get(e.getKey())
						.getProperty("firstName").toString());
				session.setAttribute("lastName", ds.get(e.getKey())
						.getProperty("lastName").toString());
				session.setAttribute("id", session.getId());
				req.getRequestDispatcher("/home").forward(req, resp);
			} catch (EntityNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}
}

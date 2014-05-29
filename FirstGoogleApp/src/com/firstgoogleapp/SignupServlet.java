package com.firstgoogleapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;

@SuppressWarnings("serial")
public class SignupServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		req.getRequestDispatcher("/WEB-INF/signup.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				String firstName = req.getParameter("firstName");
				String lastName = req.getParameter("lastName");
				String email = req.getParameter("email");

				com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

				Entity e = new Entity("User", email);

				RequestDispatcher dispatch = req.getRequestDispatcher("/WEB-INF/signup.jsp");

				boolean acceptForm = true;


				try {
					// Check if key (email) already exists
					if (ds.get(e.getKey()) != null) {
						resp.setContentType("text/plain");
						resp.getWriter().println("<div style='text-align:center; margin:0 auto; padding-top:15px'>");
						resp.getWriter().println("<h4 class='text-danger'>"
								+ "<span class='glyphicon glyphicon-exclamation-sign'></span> Email address already exists</h4>");
						resp.getWriter().println("</div>");
						acceptForm = false;
					}
				} catch (EntityNotFoundException e1) {
					// Email not in database
					// Check if passwords match
					if (req.getParameter("password").equals(req.getParameter("confirmPassword"))) {
						// Set password hash
						try {
							e.setProperty("password", PasswordHash.createHash(req.getParameter("password")));
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					} else {
						// Passwords don't match
						System.out.println("Passwords don't match");
						resp.setContentType("text/plain");
						resp.getWriter().println("Passwords don't match");
						acceptForm = false;
					}

				}

				if (!acceptForm) {
					dispatch.forward(req, resp);
				} else {
					e.setProperty("firstName", firstName);
					e.setProperty("lastName", lastName);
					e.setProperty("verified", false);
					e.setProperty("skillSet", "");
					e.setProperty("workExperience", "");
					e.setProperty("education", "");
					e.setProperty("aboutMe", "Enter information about yourself");
					e.setProperty("hobbies", "You have no hobbies");
					e.setProperty("interests", "You have no interests");
					e.setProperty("numFriends", 0);
					EmbeddedEntity friends = new EmbeddedEntity();
					e.setProperty("friends", friends);
					// Store entity in datastore
					ds.put(e);				
					
					try {
						HttpSession session = req.getSession();
						session.setAttribute("email", email);
						session.setAttribute("firstName", ds.get(e.getKey()).getProperty("firstName").toString());
						session.setAttribute("lastName", ds.get(e.getKey()).getProperty("lastName").toString());
						req.getRequestDispatcher("/WEB-INF/verify.jsp").forward(req, resp);
					} catch (EntityNotFoundException e1) {
						e1.printStackTrace();
					}
				}

			}
}

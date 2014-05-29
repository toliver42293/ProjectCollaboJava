package com.firstgoogleapp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.EmbeddedEntity;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
public class AddFriendsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		HttpSession session = req.getSession();
//		try {
//			Entity e = ds.get(new Entity("User", (String)session.getAttribute("email")).getKey());
//			Key k1 = ds.get(new Entity("User", "test@example.com").getKey()).getKey();
//			Key k2 = ds.get(new Entity("User", "attache3@yahoo.com").getKey()).getKey();
//			Key k3 = ds.get(new Entity("User", "zsylvia@umassd.edu").getKey()).getKey();
//			e.setProperty("numFriends", 3);
//			EmbeddedEntity friends = new EmbeddedEntity();
//			friends.setProperty("0", k1);
//			friends.setProperty("1", k2);
//			friends.setProperty("2", k3);
//			e.setProperty("friends", friends);
//			ds.put(e);
//			
//		} catch (EntityNotFoundException ex) {
//			ex.printStackTrace();
//		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		com.google.appengine.api.datastore.DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		HttpSession session = req.getSession();
		try {
			//Get current logged in user Entity
			Entity e = ds.get(new Entity("User", (String)session.getAttribute("email")).getKey());
			//Get key of Entity(kind: User, key: new friends key)
			Key key = new Entity("User", req.getParameter("friend")).getKey();
			//Current number of friends
			int numFriends = (int) e.getProperty("numFriends");
			//Get current list of friends from user
			EmbeddedEntity m = (EmbeddedEntity)e.getProperty("friends");
			//Add new friend to friend list at position numFriends (because friends list starts from 0)
			m.setProperty(String.valueOf(numFriends), key);
			//Give new friends list to user Entity
			e.setProperty("friends", m);
			//Update number of friends for user Entity
			e.setProperty("numFriends", numFriends++);
			//Update user Entity in database
			ds.put(e);
		} catch (EntityNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}

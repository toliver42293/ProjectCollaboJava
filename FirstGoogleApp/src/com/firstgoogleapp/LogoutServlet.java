package com.firstgoogleapp;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.Projection;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		HttpSession session = req.getSession();
		if (session.getAttribute("id") != null) {
			session.invalidate();
			session = req.getSession();
			resp.sendRedirect("/login");
		}else{
			resp.sendRedirect("/home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}
}

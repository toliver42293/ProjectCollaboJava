package com.firstgoogleapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class WelcomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		HttpSession session = req.getSession();
		if(session.getAttribute("id") != null){
			//User is logged in
			req.getRequestDispatcher("main-loggedin.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.sendRedirect("/WEB-INF/index.jsp");
	}
}

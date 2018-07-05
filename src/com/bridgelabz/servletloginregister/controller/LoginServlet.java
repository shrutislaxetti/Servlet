package com.bridgelabz.servletloginregister.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servletloginregister.repositories.UserRepository;
import com.bridgelabz.servletloginregister.repositories.UserRepositoryImplementation;
import com.bridgelabz.servletloginservlet.model.User;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		User user = new User();
		UserRepository userrepository = new UserRepositoryImplementation();
		String username = request.getParameter("username");
		String password = request.getParameter("passward");
		user=userrepository.getUserByUserName(username);
		if (user != null) {
			
			if (user.getPassward().equals(password) ){
				HttpSession session = request.getSession();
				session.setAttribute("username", user.getUsername());
				RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
				rd.forward(request, response);
			}

			else {
				out.print("Sorry password Incorrect");
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
			}
		} else {
			out.print("Sorry userName Incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.include(request, response);
		}
		out.close();
	}
}

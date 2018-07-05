package com.bridgelabz.servletloginregister.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.servletloginregister.repositories.UserRepository;
import com.bridgelabz.servletloginregister.repositories.UserRepositoryImplementation;
import com.bridgelabz.servletloginservlet.model.User;


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		UserRepository dao = new UserRepositoryImplementation();
		response.setContentType("text/html");
		user.setUsername(request.getParameter("username"));
		user.setEmail(request.getParameter("email"));
		user.setPhone(request.getParameter("phone"));
		user.setPassward(request.getParameter("passward"));

		try {
			dao.registerUser(user);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
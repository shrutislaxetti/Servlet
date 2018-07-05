package com.bridgelabz.servletloginregister.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class RegisterFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public RegisterFilter() {

	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name = request.getParameter("username");
		String Phno = request.getParameter("phone");
		String Email = request.getParameter("email");
		String Password = request.getParameter("passward");
		String confirm_pass = request.getParameter("confirm_pass");

		if (Name.equals("") || Phno.equals("") || Email.equals("") || Password.equals("")) {
			out.print("fields can not be empty");
		}

		if (!Password.equals(confirm_pass)) {
		  out.print("Passward you have entered is incorrect");
		  RequestDispatcher rd = request.getRequestDispatcher("unsuccessfulreg.jsp");
		  rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("successful.jsp");
			rd.forward(request, response);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

	}

}

package com.bridgelabz.servletloginregister.controller;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
 @WebServlet("/SendMailServlet")     
@SuppressWarnings("serial")
public class SendMailServlet extends HttpServlet{
	final String admin = "shrutilaxetti@gmail.com";
	final String passwordAdmin = "9449374262";
	
    public void doGet(HttpServletRequest request,HttpServletResponse response)  
        throws ServletException, IOException {  
    	System.out.println("********************* Inside sendmailservice");
		
    	String email = request.getParameter("email");
		
		Mailer.send(email, admin, passwordAdmin);
		System.out.println("Redirecting to ResetPasswordServlet......................");
		response.sendRedirect("PasswordServlet");
    }  
 
    
}
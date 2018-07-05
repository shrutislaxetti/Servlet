package com.bridgelabz.servletloginregister.controller;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {
	static int total = 0;
	static int user = 0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		total++;
		user++;
		System.out.println("A new session is created");
		System.out.println("Total" + "-" + total);
		System.out.println("CurrentUser" + "-" + user);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("session is destroyed");
		user--;
		System.out.println("Current User" + "-" + user);
	}
}

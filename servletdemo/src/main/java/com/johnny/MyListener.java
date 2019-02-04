package com.johnny;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Servlet Listener contextInit!!!");
		sce.getServletContext().setAttribute("name", "Johnny");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Servlet Listener contextDestroy!!!");
		ServletContextListener.super.contextDestroyed(sce);
	}
}

package com.johnny;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet init!!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet doGet!!!");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head></head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("<h1>Hello, " + getName() + "</h1>");
		resp.getWriter().println("</body>");
		resp.getWriter().println("<html>");
	}
	
	private Object getName() {
		return getServletContext().getAttribute("name");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet destroy!!!");
	}
}

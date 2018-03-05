package com.shawn.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		System.out.println(this.getInitParameter("color"));
		
		System.out.println(req.getRequestedSessionId());
		super.doGet(req, resp);
		Cookie[] cookie = req.getCookies();
		System.out.println(cookie[0]);
		String rqs = req.getRequestedSessionId();
		System.out.println(rqs);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		super.doPost(req, resp);
	}
}

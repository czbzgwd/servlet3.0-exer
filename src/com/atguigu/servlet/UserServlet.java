package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		resp.getWriter().write("tomcat...");
	}
}

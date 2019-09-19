package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		System.out.println(Thread.currentThread()+"start...");
		try {
			sayHello();
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.getWriter().write("hello...");
		System.out.println(Thread.currentThread()+"end...");
	}
	
	public void sayHello() throws Exception{
		System.out.println(Thread.currentThread()+"processing...");
		Thread.sleep(3000);
	}
}

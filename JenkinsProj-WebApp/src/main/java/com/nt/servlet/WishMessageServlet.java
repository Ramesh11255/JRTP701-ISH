package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/wishurl")
public class WishMessageServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	res.setContentType("text/html");
	
	PrintWriter pw=res.getWriter();
	
	pw.println("<h1 style='color:red;text-align:center'>Hello Ramesh, Good Morning </h1>");
	
	pw.println("<br><br><a href='index.jsp'>Home ramesh</a>");
	
	pw.close();
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}

package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeSevlet
 */
@WebServlet("/include")
public class IncludeSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
		String url = "search?id=101";
		RequestDispatcher dispatcher=null;
		resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("1111111111111111");
	
	out.print("<br>");
	dispatcher=req.getRequestDispatcher("index.html");
	dispatcher.include(req, resp);
	out.print("<br>");
	out.print("2222222222222222");
	
	out.print("<br>");
	dispatcher=req.getRequestDispatcher("currentDate?fname=nanda&lname=kishore");
	dispatcher.include(req, resp);
	out.print("<br>");
	
	out.print("333333333333333");
	
    out.print("<br>");
	dispatcher=req.getRequestDispatcher("/search?id=101");
	dispatcher.include(req, resp);
	out.print("<br>");
	
	}

}

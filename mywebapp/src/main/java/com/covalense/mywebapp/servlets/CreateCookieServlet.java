package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateCookieServlet
 */
@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		// Create Cookie
		Cookie MyNamecookie = new Cookie("myName", "kishore");// non-persistent cookie
		Cookie myLocationcookie = new Cookie("myLocation", "Bangalore");// user non-persistent cookie
		myLocationcookie.setMaxAge(7 * 24 * 60 * 60);// user persistent cookie

		/*
		 * Cookie sessionCookie=new Cookie("JSESSION", session.getId());//non-persistent
		 * cookie from browser sessionCookie.setMaxAge(7*24*60);//make browser cookie as
		 * persistent cookie
		 */
		// Send the cookie to browser
		resp.addCookie(MyNamecookie);
		resp.addCookie(myLocationcookie);
		PrintWriter out = resp.getWriter();
		out.print("Created the cookie!!!!!");
	}

}

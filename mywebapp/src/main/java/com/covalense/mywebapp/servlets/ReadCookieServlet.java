package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadCookieServlet
 */
@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Get the cookies
		Cookie[] recievedCookies = req.getCookies();

		PrintWriter out = resp.getWriter();

		if (recievedCookies == null) {
			out.print("Cookies are not present");
		} else {
			out.print("Cookies are present!!!!!");
			for (Cookie rcvdCookie : recievedCookies) {
				out.print("Cookie name:" + rcvdCookie.getName());
				out.print("Cookie value:" + rcvdCookie.getValue());
			}
		}

	}

}

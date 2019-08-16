package com.covalense.empmngmnt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Invalidate session
		HttpSession session = req.getSession(false);

		if (session == null) {
			session.invalidate();
		}

		PrintWriter out = resp.getWriter();
		out.print("<h1><span style='color:green'>Thanks for visiting!!</h1>");
		out.print("<BR><BR>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);

	}
}
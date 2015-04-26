package com.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/HomeServlet", "/HomeAnother" })
public class HomeServlet extends HttpServlet {

	public HomeServlet() {
		super();
		System.out.print("################## New Instance HomeServlet()");
	}

	private static final long serialVersionUID = -8205786946111596936L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (Boolean.TRUE.equals(req.getAttribute(LoggingServletFilter.SERVLET_FILTERED))) {
			System.out.println("The request has been passed by a LogginServletFilter");
		}
		SessionCookieConfig sessionCookieConfig = req.getServletContext().getSessionCookieConfig();
		System.out.println("Calling HomeServlet.doGet -- sessionCookieConfig name:" + sessionCookieConfig.getName() + " comment: " + sessionCookieConfig.getComment() + " dommain: "
				+ sessionCookieConfig.getDomain() + " maxAge: " + sessionCookieConfig.getMaxAge() + " path: " + sessionCookieConfig.getPath() + " httpOnly: " + sessionCookieConfig.isHttpOnly()
				+ " secure: " + sessionCookieConfig.isSecure());

		resp.sendRedirect(req.getContextPath());
	}

}

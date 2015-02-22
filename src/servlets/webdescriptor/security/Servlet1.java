package servlets.webdescriptor.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.listerners.HttpSessionActivationListenerTest;

//@WebServlet(name="SecurityServlet1",urlPatterns="/webdescriptor/security/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSessionActivationListenerTest test1 = new HttpSessionActivationListenerTest();
		
		req.getSession().setAttribute("TESTLIS",test1);
		
		resp.getWriter().write("VOCE ESTA LOGADO COMO:" + req.getUserPrincipal().getName());
		resp.getWriter().write(" </br> REMOTE:" + req.getRemoteUser());
		resp.getWriter().write(" ABACATE:" + req.isUserInRole("ABACATE"));
	}
}

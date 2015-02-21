package servlets.annotation.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/annotation/loginsecurity")
public class LoginServlet3 extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3178702382730577671L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		if(req.getUserPrincipal() != null ) {
			req.logout();
		}
		req.login(req.getParameter("l"), req.getParameter("p"));
		
		req.authenticate(resp);//it is necessary to call authenticate to proceed with the login process.
		
		resp.sendRedirect("security/servlet2");
//		req.getRequestDispatcher("/securitytestservlet").forward(req, resp);
	}
}

package servlets.tests;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ServletSecurity(
//		httpMethodConstraints={@HttpMethodConstraint(value="GET", rolesAllowed="ADMIN")},
		value=@HttpConstraint(rolesAllowed="ADMIN")
)
@WebServlet(urlPatterns="/securitytestservlet", name="SecurityTest")
public class SecurityTest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7683695993139817565L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.getWriter().write("VOCE ESTA LOGADO COMO:" + req.getUserPrincipal().getName());
		resp.getWriter().write(" </br> REMOTE:" + req.getRemoteUser());
		resp.getWriter().write(" ADMIN:" + req.isUserInRole("ADMIN"));
	}

}

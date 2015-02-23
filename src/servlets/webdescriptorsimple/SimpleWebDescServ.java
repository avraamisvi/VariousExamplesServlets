package servlets.webdescriptorsimple;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@DeclareRoles({"TESTE1", "TESTE2"})
public class SimpleWebDescServ extends HttpServlet {
	
	@PostConstruct
	public void teste() {
		System.out.println("OLA MUNDO");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@PreDestroy");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.getWriter().write("initPar:" + this.getServletConfig().getInitParameter("initpar"));
	}
}

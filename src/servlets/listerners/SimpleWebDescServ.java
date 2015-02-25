package servlets.listerners;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.security.DeclareRoles;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/simpleservdynamictest", name="simpleservdynamictest")
public class SimpleWebDescServ extends HttpServlet {
	
	String data = "normal";
	
	public SimpleWebDescServ() {
		super();
	}
	
	public SimpleWebDescServ(String data) {
		this.data = data;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.getWriter().write("DATA:" + data);
		System.out.println(data);
		
	}
}

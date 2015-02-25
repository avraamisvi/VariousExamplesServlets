package servlets.listerners;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebListener
public class ServletContextLis implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Destroyed:" + arg0.getServletContext().getContextPath());
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Initialized:" + arg0.getServletContext().getContextPath());
		
		System.out.println("Creating new servlet");
			
			HttpServlet serv = new HttpServlet() {
				@Override
				protected void doGet(HttpServletRequest req,
						HttpServletResponse resp) throws ServletException,
						IOException {
					resp.getWriter().println("Servlet dynamically created");
				}
			};
			
			arg0.getServletContext().addServlet("dynamicallycreated", serv).addMapping("/dynamicallycreated");
		System.out.println("Finished Creating new servlet");
		
		SimpleWebDescServ serv2 = new SimpleWebDescServ("dynamic");
		Dynamic dyn = arg0.getServletContext().addServlet("simpleservdynamictest2", 
				serv2);
		dyn.addMapping("/simpleservdynamictest");
	}

}

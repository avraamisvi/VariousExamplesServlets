package servlets.listerners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextLis implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Destroyed:" + arg0.getServletContext().getContextPath());
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Initialized:" + arg0.getServletContext().getContextPath());
	}

}

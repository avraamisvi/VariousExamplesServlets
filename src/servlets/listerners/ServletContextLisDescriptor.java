package servlets.listerners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextLisDescriptor implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Destroyed: ServletContextLisDescriptor");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Initialized: ServletContextLisDescriptor");
	}

}

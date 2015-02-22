package servlets.listerners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HttpSessionListenerTest implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("Created:" + arg0.getSource());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("Destroyed:" + arg0.getSource());
	}

}

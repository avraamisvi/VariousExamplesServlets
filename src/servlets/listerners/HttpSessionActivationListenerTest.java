package servlets.listerners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class HttpSessionActivationListenerTest implements
		HttpSessionActivationListener {

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("sessionDidActivate:" + arg0.getSource());
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("sessionWillPassivate:" + arg0.getSource());
	}

}

package servlets.tests;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionBindingListerner implements HttpSessionBindingListener {

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getName());
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println(arg0.getName());
	}

}

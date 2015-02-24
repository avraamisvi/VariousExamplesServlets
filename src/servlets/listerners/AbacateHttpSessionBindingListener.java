package servlets.listerners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class AbacateHttpSessionBindingListener implements
		HttpSessionBindingListener {
	public String data = "original";
	
	public AbacateHttpSessionBindingListener(String data) {
		this.data = data;
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("abacate:valueUnbound = " + event.getValue());
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("abacate:valueBound = " + event.getValue() );
	}
	@Override
	public String toString() {				
		return data;
	}
}

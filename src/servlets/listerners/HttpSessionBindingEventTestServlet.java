package servlets.listerners;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebServlet("/httpsessionbindingeventtest")
public class HttpSessionBindingEventTestServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		AbacateHttpSessionBindingListener abacate = 
				new AbacateHttpSessionBindingListener(req.getParameter("data"));
		
		req.getSession().setAttribute("abacate", abacate);
	}
}

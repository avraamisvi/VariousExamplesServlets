package servlets.tests;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebServlet(urlPatterns={"/dipatcherTest"}, name = "dipatcherTest")
public class ServletDispatcherTest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1387936481405388162L;

	@Override
	public void init(ServletConfig config) throws ServletException {

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//the interface ServletContext declare getRequestDispatcher
		req.getServletContext().getRequestDispatcher("/testeDispatch.jsp").forward(req, resp);
		
		//the interface ServletContext has getRequestDispatcher inherited from ServletRequest
//		req.getRequestDispatcher(arg0);
	}
}

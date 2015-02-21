package servlets.tests;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="sessiontest", urlPatterns="/httpsessionbindingtest")
public class ServletSessionListernerConfig extends HttpServlet {

	public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
		//the code below generates an exception because it is illegal to add a listerner after context has been initialized
		/*config.getServletContext().addListener(new HttpSessionBindingListener() {
			
			@Override
			public void valueUnbound(HttpSessionBindingEvent arg0) {
				System.out.println(arg0.getName());
			}
			
			@Override
			public void valueBound(HttpSessionBindingEvent arg0) {
				System.out.println(arg0.getName());
			}
		});*/
		super.init(config);//sem isso da exceção de configuração nula
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String inv = req.getParameter("i");
		
		if(inv != null) {
			if(inv.equals("1")) {
				req.getSession().invalidate();
			} else if(inv.equals("2")) {
				req.getSession().removeAttribute("teste");
			} else {
				req.getSession().setAttribute("sessionlisternerobject", new SessionBindingListerner());
			}
		} else {
			req.getSession().setAttribute("teste", "teste");
		}
	}
}

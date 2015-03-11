package servlets.initpar;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/servletInitPar", initParams={@WebInitParam(name="teste1", value="abacaxi")})
public class ServletInitPar extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		System.out.println(this.getInitParameter("teste1"));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.getWriter().append("teste1:" + this.getServletConfig().getInitParameter("teste1") + "   ");
		resp.getWriter().append("teste1:" + this.getServletContext().getInitParameter("teste1"));
	}
}

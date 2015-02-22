package servlets.duplicated;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="ServletDuplicate1", urlPatterns="/wftestservlet1")
public class ServletDuplicate extends HttpServlet {

	public void init(){ 
		System.out.println("Servlet Name = "+this.getServletName());
	}
}

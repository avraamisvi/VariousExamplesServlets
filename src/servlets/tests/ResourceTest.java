package servlets.tests;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resourcetestserv")
public class ResourceTest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		byte [] buff = new byte[2048];
		int i = this.getServletContext().getResourceAsStream("/WEB-INF/teste.txt").read(buff);
//		req.getServletContext().getResourceAsStream("/WEB-INF/teste.txt").read(buff);
		resp.getOutputStream().write(buff, 0, i);
		
	}
}

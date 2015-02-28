package env.entry.tests;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/enventrytestserv")
public class EnvEntryTestServ extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Resource(name="testRes")
	String testRes;
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("EnvEntryTestServ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().append(testRes);
		
		Cookie cook = new Cookie("ABRAAO_TEST", "VALUE");
		cook.setMaxAge(10000);
		
		resp.addCookie(cook);
	}
}

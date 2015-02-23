package sync.async;

import java.io.IOException;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/asyncservlet", asyncSupported=true)
public class AsyncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		final AsyncContext context = req.startAsync(req, resp);
//		final AsyncContext context = req.startAsync();
		context.dispatch("/asyncservlet2");
		
		System.out.println("testando 123");
		resp.setStatus(200);
		resp.getWriter().append("TESTE");
	}
}

package taglib.test;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().println("MY TAG TEST");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}

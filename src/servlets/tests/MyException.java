package servlets.tests;

import javax.servlet.ServletException;

public class MyException extends ServletException {

	public MyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyException(String message, Throwable rootCause) {
		super(message, rootCause);
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyException(Throwable rootCause) {
		super(rootCause);
		// TODO Auto-generated constructor stub
	}
}

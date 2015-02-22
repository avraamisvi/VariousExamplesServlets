package jsp.tests;

public class AudioBook extends Book {
	private String isbn;
	private String test = "testando";
	
	public AudioBook() {
		isbn = "UNDEFINED_AUDIOBOOK";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String value) {
		this.isbn = value;
	}
	
	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}
}

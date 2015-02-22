package jsp.tests;

public class AudioBook extends Book {
	private String isbn;

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
		return "testando";
	}
}

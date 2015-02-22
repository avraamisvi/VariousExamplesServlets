package jsp.tests;

public class Book {
	private String isbn;

	public Book() {
		isbn = "UNDEFINED_BOOK";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String value) {
		this.isbn = value;
	}
}

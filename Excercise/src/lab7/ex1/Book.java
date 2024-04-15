package lab7.ex1;

import java.util.Date;

public class Book {

	private String id;
	private String title;
	private String authour;
	private Date publisher;
	private boolean available;

	public Book(String id, String title, String authour, Date publisher) {
		super();
		this.id = id;
		this.title = title;
		this.authour = authour;
		this.publisher = publisher;
		this.available = true;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthour() {
		return authour;
	}

	public Date getPublisher() {
		return publisher;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authour=" + authour + ", publisher=" + publisher
				+ ", available=" + available + "]";
	}

	
}

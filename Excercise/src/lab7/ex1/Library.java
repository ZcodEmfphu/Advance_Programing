package lab7.ex1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Library {

	private String name;
	private List<Book> listBooks;

	public Library(String name) {
		super();
		this.name = name;
		this.listBooks = new ArrayList<Book>();

	}

	public void addBooks(Book book) {
		listBooks.add(book);
	}

	public void removeBooks(Book book) {
		listBooks.remove(book);
	}

	public void displayBooks() {
		StringBuilder sb = new StringBuilder();
		sb.append("Books in ").append(name).append(": \n");
		for (int i = 0; i < listBooks.size(); i++) {
			sb.append(i + 1).append(") ").append(listBooks.get(i)).append("\n");
		}
		System.out.println(sb.toString());
	}

}

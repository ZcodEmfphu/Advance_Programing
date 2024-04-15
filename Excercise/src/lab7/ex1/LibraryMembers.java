package lab7.ex1;

import java.util.ArrayList;
import java.util.List;

public class LibraryMembers {

	private String id;
	private String name;

	private List<Book> listBorrows;

	public LibraryMembers(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.listBorrows = new ArrayList<Book>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Book> getListBorrows() {
		return listBorrows;
	}

	public void borrowBooks(Book book) {
		if (book.isAvailable()) {
			listBorrows.add(book);
			book.setAvailable(false);
		} else {
			System.out.println("Borrow Fail !");
		}
	}

	public void returnBooks(Book book) {
		if (!book.isAvailable()) {
			listBorrows.remove(book);
			book.setAvailable(true);
		} else {
			System.out.println("Return Fail !");
		}
	}

	public void displayInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Infor of ").append(name).append(": \n");
		for (int i = 0; i < listBorrows.size(); i++) {
			sb.append(i + 1).append(") ").append(listBorrows.get(i)).append("\n");
		}
		System.out.println(sb.toString());
	}

	@Override
	public String toString() {
		return "LibraryMembers [id=" + id + ", name=" + name + ", listBorrows=" + listBorrows + "]";
	}

}

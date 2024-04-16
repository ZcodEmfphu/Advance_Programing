package testcase.lab7;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import lab7.ex1.Book;
import lab7.ex1.Library;
import lab7.ex1.LibraryMembers;

public class Ex1_Test {

	@Test
	public void libraryManagementSystem() {

		Library library = new Library("Thư Viện Nông Lâm");

		Book book1 = new Book("001", "To Kill a Mockingbird", "Harper Lee",
				new GregorianCalendar(2024, Calendar.APRIL, 15).getTime());
		Book book2 = new Book("002", "The Great Gatsby", "F. Scott Fitzgerald",
				new GregorianCalendar(2024, Calendar.APRIL, 15).getTime());
		Book book3 = new Book("003", "1984", "George Orwell",
				new GregorianCalendar(2024, Calendar.APRIL, 15).getTime());
		Book book4 = new Book("004", "Pride and Prejudice", "Jane Austen",
				new GregorianCalendar(2024, Calendar.APRIL, 15).getTime());
		Book book5 = new Book("005", "The Catcher in the Rye", "J.D. Salinger",
				new GregorianCalendar(2024, Calendar.APRIL, 15).getTime());

		library.addBooks(book1);
		library.addBooks(book2);
		library.addBooks(book3);
		library.addBooks(book4);
		library.addBooks(book5);

		LibraryMembers member1 = new LibraryMembers("001", "Alice");
		member1.borrowBooks(book1);
		member1.borrowBooks(book2);
		member1.borrowBooks(book4);

		LibraryMembers member2 = new LibraryMembers("002", "Bob");
		member2.borrowBooks(book3);
		member2.borrowBooks(book5);

		library.displayBooks();
		System.out.println(
				"==============================================================================================================================================");
		member1.displayInfo();
		System.out.println(
				"==============================================================================================================================================");
		member2.displayInfo();

	}

}

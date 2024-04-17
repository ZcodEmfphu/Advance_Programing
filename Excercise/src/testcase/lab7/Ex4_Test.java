package testcase.lab7;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import lab7.ex4.*;

public class Ex4_Test {

	@Test
	public void schoolManagementSystem() {

		Course course1 = new Course("C001", "Java Programming",
				new GregorianCalendar(2024, Calendar.JANUARY, 1).getTime(),
				new GregorianCalendar(2024, Calendar.APRIL, 3).getTime());
		Course course2 = new Course("C002", "Advanced Java Programming",
				new GregorianCalendar(2024, Calendar.FEBRUARY, 15).getTime(),
				new GregorianCalendar(2024, Calendar.MAY, 15).getTime());
		Course course3 = new Course("C003", "Data Structures in Java",
				new GregorianCalendar(2024, Calendar.MARCH, 10).getTime(),
				new GregorianCalendar(2024, Calendar.JUNE, 10).getTime());
		Course course4 = new Course("C004", "Java Web Development",
				new GregorianCalendar(2024, Calendar.APRIL, 5).getTime(),
				new GregorianCalendar(2024, Calendar.JULY, 5).getTime());
		Course course5 = new Course("C005", "Java GUI Programming",
				new GregorianCalendar(2024, Calendar.MAY, 20).getTime(),
				new GregorianCalendar(2024, Calendar.AUGUST, 20).getTime());

		Student student1 = new Student("S001", "Alice Smith", "123 Main St");
		Student student2 = new Student("S002", "Bob Johnson", "456 Elm St");

		Teacher teacher1 = new Teacher("T001", "John Doe");
		Teacher teacher2 = new Teacher("T002", "Jane Smith");
		Teacher teacher3 = new Teacher("T003", "Michael Johnson");

		course1.assign(teacher1);
		course2.assign(teacher2);
		course3.assign(teacher3);
		course4.assign(teacher2);
		course5.assign(teacher1);

		student1.enroll(course1);
		student1.enroll(course2);
		student1.enroll(course5);

		student2.enroll(course3);
		student2.enroll(course4);
		student2.enroll(course1);

		student1.schedule();

		student2.schedule();

	}

}

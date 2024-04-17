package lab7.ex4;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private String id;
	private String name;
	private List<Course> listCourse;

	public Teacher(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.listCourse = new ArrayList<Course>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Course> getListCourse() {
		return listCourse;
	}

	public void assign(Course course) {
		listCourse.add(course);
	}

	@Override
	public String toString() {
		return "Teacher id:" + id;
	}

}

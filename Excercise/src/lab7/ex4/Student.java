package lab7.ex4;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String id;
	private String name;
	private String address;
	private List<Course> listCourse;

	public Student(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.listCourse = new ArrayList<Course>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Course> getListCourse() {
		return listCourse;
	}

	public void enroll(Course course) {
		listCourse.add(course);
	}

	public void schedule() {
		StringBuilder sb = new StringBuilder();
		sb.append("Schedule of ").append(name).append(" :\n");
		for (int i = 0; i < listCourse.size(); i++) {
			sb.append(i + 1).append(")").append(listCourse.get(i)).append("\n");
		}
		System.out.println(sb.toString());
		System.out.println(
				"===============================================================================================================================================");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", listCourse=" + listCourse + "]";
	}

}

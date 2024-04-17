package lab7.ex4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

	private String id;
	private String name;
	private Date dateStart;
	private Date dateEnd;
	private Teacher teacher;
	private List<Student> listStudent;

	public Course(String id, String name, Date dateStart, Date dateEnd) {
		super();
		this.id = id;
		this.name = name;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.teacher = null;
		this.listStudent = new ArrayList<Student>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void assign(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd
				+ ", teacher=" + teacher;
	}

}

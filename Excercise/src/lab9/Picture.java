package lab9;

public class Picture {
	private String name;
	private int year;
	private String type;
	private String style;
	private Author author;

	public Picture(String name, int year, String type, String style, Author author) {
		this.name = name;
		this.year = year;
		this.type = type;
		this.style = style;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Tên: " + name + "\n" + "Năm sáng tác: " + year + "\n" + "Loại: " + type + "\n" + "Phong cách: " + style
				+ "\n" + "Tác giả: " + author.getName();
	}
}

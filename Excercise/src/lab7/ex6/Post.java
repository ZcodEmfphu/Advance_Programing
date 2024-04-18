package lab7.ex6;

import java.sql.Date;

public class Post {
	private String content;
	private User author;
	private Date postTime;

	public Post(String content, User author) {
		this.content = content;
		this.author = author;
		this.postTime = new Date(0);
	}

	public String getContent() {
		return content;
	}

	public User getAuthor() {
		return author;
	}

	public Date getPostTime() {
		return postTime;
	}
}

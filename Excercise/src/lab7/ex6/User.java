package lab7.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
	private String username;
	private List<User> friends;
	private List<Post> posts;

	public User(String username) {
		this.username = username;
		this.friends = new ArrayList<>();
		this.posts = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void addFriend(User friend) {
		friends.add(friend);
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void addPost(Post post) {
		posts.add(post);
	}

	public List<Post> getTimeline() {
		List<Post> timeline = new ArrayList<>();
		for (User friend : friends) {
			timeline.addAll(friend.getPosts());
		}
		timeline.addAll(posts);
		Collections.sort(timeline, Comparator.comparing(Post::getPostTime).reversed());
		return timeline;
	}

}

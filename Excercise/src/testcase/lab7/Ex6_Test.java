package testcase.lab7;

import java.util.List;

import org.junit.Test;

import lab7.ex5.*;
import lab7.ex6.Post;
import lab7.ex6.User;

public class Ex6_Test {

	@Test
	public void socialNetworkingSystem() {

		User user1 = new User("Alice");
		User user2 = new User("Bob");
		User user3 = new User("Charlie");

		// Add friends
		user1.addFriend(user2);
		user2.addFriend(user1);
		user2.addFriend(user3);
		user3.addFriend(user2);

		// Create posts
		Post post1 = new Post("Hello, World!", user1);
		Post post2 = new Post("Java is awesome!", user2);
		Post post3 = new Post("Feeling excited today!", user3);

		// Add posts
		user1.addPost(post1);
		user2.addPost(post2);
		user3.addPost(post3);

		// Display Alice's timeline
		List<Post> aliceTimeline = user1.getTimeline();
		System.out.println("Alice's Timeline:");
		for (Post post : aliceTimeline) {
			System.out.println(
					post.getAuthor().getUsername() + ": " + post.getContent() + " (" + post.getPostTime() + ")");
		}
	}
}

package week_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExample1 {

	@Test
	public void findLongestString() {
		String[] arr1 = { "Java", "Python", "C++", "JavaScript", "Ruby" };
		String[] arr2 = { "Hello", "World", "Java" };

		assertEquals("JavaScript", Example1.findLongestString(arr1));
		assertEquals("Hello", Example1.findLongestString(arr2));

	}

}

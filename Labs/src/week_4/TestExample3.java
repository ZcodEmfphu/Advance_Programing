package week_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExample3 {

	@Test
	public void isPalindrome() {
		String str1 = "A man, a plan, a canal, Panama!";
		String str2 = "Java";
		assertEquals(false, Example3.isPalindrome(str2));
		assertEquals(true, Example3.isPalindrome(str1));
	}

}

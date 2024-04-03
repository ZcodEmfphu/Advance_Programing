package week_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestExample2 {

	@Test
	public void countCharacters() {

		String str1 = "hello world";
		String str2 = "programming";

		Example2.countCharacters(str1);
		System.out.println("-----------------------");
		Example2.countCharacters(str2);

	}

}

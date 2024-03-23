package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex7;

public class Ex7_Test {

	@Test
	public void checkTriagle() {
		assertEquals("Tam giác đều", Ex7.checkTriagle(3, 3, 3));
		assertEquals("Tam giác cân", Ex7.checkTriagle(4, 4, 3));
		assertEquals("Tam giác vuông", Ex7.checkTriagle(4, 5, 3));
		assertEquals("Tam giác thường", Ex7.checkTriagle(6, 5, 3));
	}

}

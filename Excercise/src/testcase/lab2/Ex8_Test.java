package testcase.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex8;

public class Ex8_Test {

	@Test
	public void namAmLich() {
		assertEquals("Nhâm Ngọ", Ex8.namAmLich(2002));
		assertEquals("Ất Dậu", Ex8.namAmLich(2005));
		assertEquals("Đinh Hợi", Ex8.namAmLich(2007));
		assertEquals("Bính Tuất", Ex8.namAmLich(2006));

	}

}

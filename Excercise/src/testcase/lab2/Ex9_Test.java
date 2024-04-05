package testcase.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex9;

public class Ex9_Test {

	@Test
	public void docSo() {
		assertEquals("Một trăm ba mươi năm", Ex9.docSo(135));
		assertEquals("năm mươi", Ex9.docSo(50));
	}

}

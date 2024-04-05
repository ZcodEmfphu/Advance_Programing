package testcase.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex10;

public class Ex10_Test {

	@Test
	public void checkDay() {
		assertEquals("Ngày hôm sau là: 2/1/2024", Ex10.checkDay(1, 1, 2024));
		assertEquals("Ngày hôm sau là: 30/1/2024", Ex10.checkDay(29, 1, 2024));
		assertEquals("Ngày hôm sau là: 1/2/2024", Ex10.checkDay(31, 1, 2024));
		assertEquals("Ngày không hợp lệ!", Ex10.checkDay(30, 2, 2024));
	}

}

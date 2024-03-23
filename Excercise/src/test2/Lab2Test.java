package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex1;
import lab2.Ex10;
import lab2.Ex2;
import lab2.Ex3;
import lab2.Ex4;
import lab2.Ex5;
import lab2.Ex6;
import lab2.Ex7;
import lab2.Ex8;
import lab2.Ex9;

public class Lab2Test {

	@Test
	public void test() {

//		Ex1
		assertEquals(3.0, Ex1.findMaxNumber(2, 3), 0);
		assertEquals(2.0, Ex1.findMaxNumber(2, -3), 0);
		assertEquals(2.32f, Ex1.findMaxNumber(2.31f, 2.32f), 0);
		assertEquals(3.0, Ex1.findMaxNumber(3, 3), 0);

//		Ex2
		// isLeapYear
		assertFalse(Ex2.isLeapYear(1000));
		assertTrue(Ex2.isLeapYear(2024));

		// day of month/year
		assertEquals(29, Ex2.getDayInMonth(2, 2024));
		assertEquals(28, Ex2.getDayInMonth(2, 2023));
		assertEquals(30, Ex2.getDayInMonth(6, 2024));
		assertEquals(31, Ex2.getDayInMonth(5, 2024));

//		Ex3: solve ax+b=0
		assertEquals(0, Ex3.solveLinearEquation(0, 0.5), 0);
		assertEquals(-0.15625, Ex3.solveLinearEquation(3.2, 0.5), 0);
		assertEquals(-1.0, Ex3.solveLinearEquation(3, 3), 0);

// 		Ex4
		assertEquals("None", Ex4.quadraticEquationSolver(2, 3, 4));
		assertEquals("x1=2.0 x2=0.5", Ex4.quadraticEquationSolver(2, -5, 2));
		assertEquals("x1=x2=-1.0", Ex4.quadraticEquationSolver(1, 2, 1));
		assertEquals("x1=-1.5 x2=-4.8", Ex4.quadraticEquationSolver(3, 19, 22));

//		Ex5
		assertEquals(0, Ex5.calculateIntersectionLength(3, 4, 4, 3));
		assertEquals(4, Ex5.calculateIntersectionLength(4, 8, 4, 9));
		assertEquals(6, Ex5.calculateIntersectionLength(-3, 4, -4, 3));

		assertEquals(0, Ex5.calculateUnionLength(3, 4, 4, 3));
		assertEquals(5, Ex5.calculateUnionLength(4, 8, 4, 9));
		assertEquals(8, Ex5.calculateUnionLength(-3, 4, -4, 3));

		// Ex 6
		assertEquals(12.0, Ex6.trianglePerimeter(3, 4, 5), 0);
		assertEquals(6.0, Ex6.triangleArea(3, 4, 5), 0);
		assertEquals(36.86989764584401, Ex6.cornerX(Ex6.cosinCornerA(3, 4, 5)), 0);
		assertEquals(53.13010235415598, Ex6.cornerX(Ex6.cosinCornerB(3, 4, 5)), 0);
		assertEquals(90.0, Ex6.cornerX(Ex6.cosinCornerC(3, 4, 5)), 0);

		// Ex 7
		assertEquals("Tam giác đều", Ex7.checkTriagle(3, 3, 3));
		assertEquals("Tam giác cân", Ex7.checkTriagle(4, 4, 3));
		assertEquals("Tam giác vuông", Ex7.checkTriagle(4, 5, 3));
		assertEquals("Tam giác thường", Ex7.checkTriagle(6, 5, 3));

//		Ex8
		assertEquals("Nhâm Ngọ", Ex8.namAmLich(2002));
		assertEquals("Ất Dậu", Ex8.namAmLich(2005));
		assertEquals("Đinh Hợi", Ex8.namAmLich(2007));
		assertEquals("Bính Tuất", Ex8.namAmLich(2006));

//		Ex9
		assertEquals("Một trăm ba mươi năm", Ex9.docSo(135));
		assertEquals("năm mươi", Ex9.docSo(50));

//		ex10
		assertEquals("Ngày hôm sau là: 2/1/2024", Ex10.checkDay(1, 1, 2024));
		assertEquals("Ngày hôm sau là: 30/1/2024", Ex10.checkDay(29, 1, 2024));
		assertEquals("Ngày hôm sau là: 1/2/2024", Ex10.checkDay(31, 1, 2024));
		assertEquals("Ngày không hợp lệ!", Ex10.checkDay(30, 2, 2024));
	}

}

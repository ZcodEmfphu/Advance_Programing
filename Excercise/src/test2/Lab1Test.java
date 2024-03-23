package test2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1.Excercise1;
import lab1.Excercise2;
import lab1.Excercise3;
import lab1.Excercise4;
import lab1.Excercise5;

public class Lab1Test {

	@Test
	public void test() {

		// Excercise1: Nhập vào từ bàn phím một số nguyên x và một số thập phân y.
		assertEquals(4.0, Excercise1.inputNumber(2, 2.0), 0);
		assertEquals(-250.0, Excercise1.inputNumber(-20, 12.5), 0);
		assertEquals(78.0, Excercise1.inputNumber(12, 6.5), 0);
		assertEquals(2.0, Excercise1.inputNumber(1, 2.0), 0);

		// Excercise2: Nhập x từ bàn phím và tính giá trị của y, y = 4(x-3) + 20
		assertEquals(20, Excercise2.solveEquation(3));
		assertEquals(24, Excercise2.solveEquation(4));
		assertEquals(-4, Excercise2.solveEquation(-3));
		assertEquals(-8, Excercise2.solveEquation(-4));

		// Excercise3: Nhập 1 số, sau đó chuyển đổi số đó sang km
		assertEquals(1609.0, Excercise3.mileToKm(1.0), 0);
		assertEquals(4827.0, Excercise3.mileToKm(3.0), 0);
		assertEquals(8688.6, Excercise3.mileToKm(5.4), 0);
		assertEquals(11423.9, Excercise3.mileToKm(7.1), 0);

		// Excercise4: Nhập vào bán kính hình tròn. Tính chu vi và diện tích hình tròn.
		assertEquals(14.451326206513047, Excercise4.diameterOfCircle(2.3), 0);
		assertEquals(16.619025137490002, Excercise4.acreageOfCircle(2.3), 0);
		assertEquals(-7.5398223686155035, Excercise4.diameterOfCircle(-1.2), 0);
		assertEquals(4.523893421169302, Excercise4.acreageOfCircle(-1.2), 0);

		// Excercise5: Nhập vào tổng số giây. Chuyển đổi sang giờ, phút, giây
		assertEquals("0h:0m:60s", Excercise5.secondToHour(60));
		assertEquals("0h:1m:1s", Excercise5.secondToHour(61));
		assertEquals("1h:1m:0s", Excercise5.secondToHour(3660));
		assertEquals("1h:1m:1s", Excercise5.secondToHour(3661));
	}

}

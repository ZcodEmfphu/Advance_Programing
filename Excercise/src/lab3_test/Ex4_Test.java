package lab3_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lab3.Ex1;
import lab3.Ex2;
import lab3.Ex3;
import lab3.Ex4;

public class Ex4_Test {

	@Test
	public void findGCDALCM() {

		assertEquals("GCD: 6 LCM: 36", Ex4.findGCDALCM(12, 18));
		assertEquals("GCD: 7 LCM: 140", Ex4.findGCDALCM(35, 28));
		assertEquals("GCD: 1 LCM: 731", Ex4.findGCDALCM(17, 43));
	}

}

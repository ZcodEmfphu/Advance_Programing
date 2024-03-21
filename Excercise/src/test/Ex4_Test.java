package test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Ex4;

public class Ex4_Test {

	@Test
	public void quadraticEquationSolver() {
		assertEquals("None", Ex4.quadraticEquationSolver(2, 3, 4));
		assertEquals("x1=2.0 x2=0.5", Ex4.quadraticEquationSolver(2, -5, 2));
		assertEquals("x1=x2=-1.0", Ex4.quadraticEquationSolver(1, 2, 1));
		assertEquals("x1=-1.5 x2=-4.8", Ex4.quadraticEquationSolver(3, 19, 22));
	}

}

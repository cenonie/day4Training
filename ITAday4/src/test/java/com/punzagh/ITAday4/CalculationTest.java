package com.punzagh.ITAday4;

import org.junit.Test;

public class CalculationTest {
	@Test
	public void test() {
		Calculation calc = new Calculation();
		System.out.println(calc.Addition(2, 2));
		System.out.println(calc.Subtraction(2, 2));
		System.out.println(calc.Multiplication(2, 2));
		System.out.println(calc.Divition(2, 2));
	}
}

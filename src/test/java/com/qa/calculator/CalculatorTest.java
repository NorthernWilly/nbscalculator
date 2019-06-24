package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbersTogetherTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,2);
		Assert.assertEquals(4, result);
	}
	
	public void subtractTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(4,2);
		Assert.assertEquals(2, result);
	}
	
	public void multiplyTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(4,2);
		Assert.assertEquals(8, result);
	}
	
	public void divideTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.divide(6,3);
		Assert.assertEquals(2, result);
	}
}

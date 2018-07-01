package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import calc.MetodCalc;

public class Tests_Calculator {
	// testing main function

	@Test
	public void test_Divide() {
		MetodCalc mc = new MetodCalc();
		String result = String.valueOf(mc.calc("10", "5"));
		assertEquals("2.0", result);
	}

	// division by zero

	@Test(expected = ArithmeticException.class)
	public void test_Divide_zero() {
		MetodCalc mc = new MetodCalc();
		mc.calc("15", "0");
	}

	// incorrect data
	@Test(expected = NumberFormatException.class)
	public void test_Divide_incorrect() { 
	MetodCalc mc = new MetodCalc();
	mc.calc("10,2", "5");
	}
}

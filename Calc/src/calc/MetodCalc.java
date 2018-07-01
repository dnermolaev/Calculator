package calc;

/**
 * Calculation process class
 * 
 */
public class MetodCalc {
	/**
	 * Data checking method
	 * 
	 * @param s
	 */

	public static void valueOf(String s) {

		Double n = new Double(s);
		if (n.doubleValue() == n.longValue()) {
		} else {
		}

	}

	/**
	 * Calculation method
	 * 
	 * @param dividend
	 * @param s_dividend
	 * @param divider
	 * @param s_divider
	 * @return result
	 * @throws ArithmeticException
	 */

	public double calc(String s_dividend, String s_divider) {
		double result = 0;

		valueOf(s_dividend);
		valueOf(s_divider);

		Double dividend = Double.valueOf(s_dividend);
		Double divider = Double.valueOf(s_divider);

		if (divider != 0) {
			result = dividend / divider;
		} else {
			throw new ArithmeticException();
		}
		return result;
	}

}
package behavior.strategy.first;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testStrategy() {
		String exp1 = "2+8";
		ICalculator plus = new Plus();
		int result1 = plus.calculate(exp1);
		System.out.println(result1);

		String exp2 = "2-8";
		ICalculator minus = new Minus();
		int result2 = minus.calculate(exp2);
		System.out.println(result2);

		String exp3 = "2*8";
		ICalculator multiply = new Multiply();
		int result3 = multiply.calculate(exp3);
		System.out.println(result3);
	}

}

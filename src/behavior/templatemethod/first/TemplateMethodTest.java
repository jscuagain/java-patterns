package behavior.templatemethod.first;

import org.junit.Test;

public class TemplateMethodTest {
	@Test
	public void testTemplateMethod() {
		String exp1 = "8+8";
		AbstractCalculator plus = new Plus();
		int result1 = plus.calculate(exp1, "\\+");
		System.out.println(result1);

		String exp2 = "8-8";
		AbstractCalculator minus = new Minus();
		int result2 = minus.calculate(exp2, "-");
		System.out.println(result2);

		String exp3 = "8*8";
		AbstractCalculator multiply = new Multiply();
		int result3 = multiply.calculate(exp3, "\\*");
		System.out.println(result3);
	}
}

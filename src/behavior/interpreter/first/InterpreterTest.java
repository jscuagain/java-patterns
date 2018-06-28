package behavior.interpreter.first;

import org.junit.Test;

public class InterpreterTest {

	@Test
	public void testInterpreter() {
		// 计算9+2-8的值
		Minus minus = new Minus();
		int result = minus.interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(result);
	}

}

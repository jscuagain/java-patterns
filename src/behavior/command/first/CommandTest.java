package behavior.command.first;

import org.junit.Test;

public class CommandTest {
	@Test
	public void testCommand() {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}

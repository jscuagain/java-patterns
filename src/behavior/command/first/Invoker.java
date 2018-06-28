package behavior.command.first;

/**
 * 请求者角色类
 */
public class Invoker {
	private Command command = null;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		command.execute();
	}
}

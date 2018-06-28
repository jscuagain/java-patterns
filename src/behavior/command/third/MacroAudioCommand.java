package behavior.command.third;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令类，负责把个别的命令合成宏命令。
 */
public class MacroAudioCommand implements MacroCommand {
	private List<Command> commandList = new ArrayList<Command>();

	@Override
	public void add(Command cmd) {
		commandList.add(cmd);
	}

	@Override
	public void remove(Command cmd) {
		commandList.remove(cmd);
	}

	@Override
	public void execute() {
		for (Command cmd : commandList) {
			cmd.execute();
		}
	}

}

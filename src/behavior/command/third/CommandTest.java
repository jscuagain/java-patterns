package behavior.command.third;

import org.junit.Test;

public class CommandTest {
	@Test
	public void testCommand() {
		// 创建接收者对象
		AudioPlayer player = new AudioPlayer();
		
		// 创建命令对象
		Command playCommand = new PlayCommand(player);
		Command rewindCommand = new RewindCommand(player);
		Command stopCommand = new StopCommand(player);
		
		// 创建宏命令对象
		MacroCommand marco = new MacroAudioCommand();
		marco.add(playCommand);
		marco.add(rewindCommand);
		marco.add(stopCommand);
		marco.execute();
	}
}

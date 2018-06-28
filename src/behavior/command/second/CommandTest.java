package behavior.command.second;

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
		
		// 创建请求者对象
		Keypad keypad = new Keypad();
		keypad.setPlayCommand(playCommand);
		keypad.setRewindCommand(rewindCommand);
		keypad.setStopCommand(stopCommand);
		
		// 测试
		keypad.play();
		keypad.rewind();
		keypad.stop();
	}
}

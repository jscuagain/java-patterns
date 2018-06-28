package structure.bridge;

import org.junit.Test;

public class BridgeTest {

	@Test
	public void testBridge() {
		MessageImplementor impl = new SysMessage();
		AbstractMessage message = new CommonMessage(impl);
		message.sendMessage("加班申请速批", "李总");

		impl = new EmailMessage();
		message = new UrgencyMessage(impl);
		message.sendMessage("加班申请速批", "李总");
	}

}
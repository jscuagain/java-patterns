package structure.bridge;

/**
 * 系统消息类
 */
public class SysMessage implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("发送系统消息'" + message + "'给" + toUser);
	}

}

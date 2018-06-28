package structure.bridge;

/**
 * 邮件消息类
 */
public class EmailMessage implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println("发送邮件消息'" + message + "'给" + toUser);
	}

}

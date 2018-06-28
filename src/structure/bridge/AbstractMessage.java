package structure.bridge;

public abstract class AbstractMessage {

	MessageImplementor impl;

	public AbstractMessage(MessageImplementor impl) {
		this.impl = impl;
	}

	/**
	 * 发送消息，委派给实现部分的方法
	 * 
	 * @param message
	 *            消息的内容
	 * @param toUser
	 *            消息的接收者
	 */
	public void sendMessage(String message, String toUser) {
		impl.send(message, toUser);
	}

}

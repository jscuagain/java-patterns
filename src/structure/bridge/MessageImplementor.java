package structure.bridge;

/**
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {

	void send(String message , String toUser);
	
}

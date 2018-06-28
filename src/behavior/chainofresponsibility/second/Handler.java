package behavior.chainofresponsibility.second;

/**
 * 抽象处理者角色类
 */
public abstract class Handler {

	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler handler;

	/**
	 * 处理请求的方法，虽然这个方法没有传入参数，但实际是可以传入的，要根据具体需要来选择是否传入参数。
	 */
	public abstract void handleRequest();

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}

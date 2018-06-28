package behavior.chainofresponsibility.third;

/**
 * 抽象处理者角色类
 */
public abstract class Handler {

	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler handler;

	/**
	 * 处理聚餐费用的申请
	 * 
	 * @param user
	 *            申请人
	 * @param fee
	 *            申请的费用
	 * @return 成功或失败的具体通知
	 */
	public abstract String handleFeeRequest(String user, double fee);

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}

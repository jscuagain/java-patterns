package behavior.chainofresponsibility.second;

/**
 * 具体处理者角色类
 */
public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		/**
		 * 判断是否有后继的责任对象：如果有，就转发请求给后继的责任对象；如果没有，则处理请求。
		 */
		if (getHandler() != null) {
			System.out.println("放过请求");
			getHandler().handleRequest();
		} else {
			System.out.println("处理请求");
		}
	}
}

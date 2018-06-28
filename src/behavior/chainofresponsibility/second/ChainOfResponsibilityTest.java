package behavior.chainofresponsibility.second;

import org.junit.Test;

public class ChainOfResponsibilityTest {
	@Test
	public void testChainOfResponsibility() {
		// 组装责任链
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setHandler(handler2);
		// 提交请求
		handler1.handleRequest();
	}
}

package behavior.chainofresponsibility.third;

import org.junit.Test;

public class ChainOfResponsibilityTest {
	@Test
	public void testChainOfResponsibility() {
		// 组装责任链
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		h3.setHandler(h2);
		h2.setHandler(h1);

		// 开始测试
		String test1 = h3.handleFeeRequest("张三", 300);
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest("李四", 300);
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest("张三", 700);
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest("李四", 700);
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest("张三", 1500);
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest("李四", 1500);
		System.out.println("test6 = " + test6);
	}
}

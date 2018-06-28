package behavior.state.second;

import org.junit.Test;

public class StateTest {
	@Test
	public void testState() {
		State stateA = new ConcreteStateA(); // 创建状态
		State stateB = new ConcreteStateB(); // 创建状态
		
		Context context = new Context(); // 创建环境
		context.setState(stateA); // 将状态设置到环境中
		context.request("test"); // 请求
		
		System.out.println("============================");
		context.setState(stateB); // 将状态设置到环境中
		context.request("test"); // 请求
	}
}

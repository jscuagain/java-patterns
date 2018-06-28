package behavior.memento.fourth;

import org.junit.Test;

public class MementoTest {
	@Test
	public void testMemento() {
		Originator o = new Originator();
		o.setState("state 0"); // 设置发起人对象的状态
		MementoIF memento = o.createMemento(); // 创建备忘录对象，让它保存发起人对象的状态
		o.setState("state 1"); // 修改发起人对象的状态
		o.restoreOriginator(memento); // 恢复发起人对象的状态
		
		System.out.println("恢复后的发起人对象的状态：" + o.getState());
	}
}

package behavior.memento.second;

import org.junit.Test;

public class MementoTest {
	@Test
	public void testMemento() {
		Originator o = new Originator();
		Caretaker c = new Caretaker();
		o.setState("On"); // 设置发起人对象的状态
		c.setMemento(o.createMemento()); // 创建备忘录对象，让它保存发起人对象的状态，再将它存储到负责人对象
		o.setState("Off"); // 修改发起人对象的状态
		o.restoreOriginator(c.getMemento()); // 恢复发起人对象的状态
		
		System.out.println("恢复后的发起人对象的状态：" + o.getState());
	}
}

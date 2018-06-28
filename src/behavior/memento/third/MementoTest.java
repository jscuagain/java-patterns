package behavior.memento.third;

import org.junit.Test;

public class MementoTest {
	@Test
	public void testMemento() {
		Originator o = new Originator();
		Caretaker c = new Caretaker(o);
		o.setState("state 0"); // 改变状态
		c.createMemento(); // 建立一个检查点
		o.setState("state 1"); // 改变状态
		c.createMemento(); // 建立一个检查点
		o.setState("state 2"); // 改变状态
		c.createMemento(); // 建立一个检查点
		o.setState("state 3"); // 改变状态
		c.createMemento(); // 建立一个检查点
		o.printStates(); // 打印出所有检查点
		
		System.out.println("-----------------恢复检查点-----------------");
		c.restoreOriginator(2); // 恢复到第二个检查点
		o.printStates(); // 打印出所有检查点
	}
}

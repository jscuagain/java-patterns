package behavior.memento.third;

import java.util.ArrayList;
import java.util.List;

/**
 * 发起人角色类
 */
public class Originator {
	private List<String> states;

	// 检查点指数
	private int index;

	public Originator() {
		states = new ArrayList<String>();
		index = 0;
	}

	/**
	 * 返回一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(states, index);
	}

	/**
	 * 将发起人对象恢复到备忘录对象所记录的状态
	 */
	public void restoreOriginator(Memento memento) {
		states = memento.getStates();
		index = memento.getIndex();
	}

	/**
	 * 状态的赋值方法
	 */
	public void setState(String state) {
		states.add(state);
		index++;
	}

	/**
	 * 辅助方法，打印所有状态
	 */
	public void printStates() {
		for (String state : states) {
			System.out.println(state);
		}
	}
}

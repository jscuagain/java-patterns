package behavior.memento.third;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人角色类，负责保存备忘录对象，但是从不修改（甚至不查看）备忘录对象的内容。
 */
public class Caretaker {
	private Originator o;
	private List<Memento> mementos = new ArrayList<Memento>();
	private int current;

	public Caretaker(Originator o) {
		this.o = o;
		current = 0;
	}

	/**
	 * 创建一个新的检查点
	 */
	public int createMemento() {
		Memento memento = o.createMemento();
		mementos.add(memento);
		return current++;
	}

	/**
	 * 将发起人对象恢复到某个检查点
	 */
	public void restoreOriginator(int index) {
		Memento memento = mementos.get(index);
		o.restoreOriginator(memento);
	}

	/**
	 * 将某个检查点删除
	 */
	public void removeMemento(int index) {
		mementos.remove(index);
	}
}

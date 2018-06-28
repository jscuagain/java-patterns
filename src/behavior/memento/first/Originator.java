package behavior.memento.first;

/**
 * 发起人角色类，发起人对象利用一个新创建的备忘录对象将自己的内部状态存储起来。
 */
public class Originator {
	private String state;

	/**
	 * 返回一个新的备忘录对象
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 将发起人对象恢复到备忘录对象所记录的状态
	 */
	public void restoreOriginator(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + this.state);
	}
}

package behavior.memento.fourth;

/**
 * 发起人角色类，同时还兼任负责人角色，即它自己负责保持自己的备忘录对象。
 */
public class Originator {
	private String state;
	

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + state);
	}

	/**
	 * 返回一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(this);
	}

	/**
	 * 将发起人对象恢复到备忘录对象所记录的状态
	 */
	public void restoreOriginator(MementoIF memento) {
		Memento m = (Memento) memento;
		setState(m.state);
	}

	private class Memento implements MementoIF {
		private String state;

		private Memento(Originator o) {
			this.state = o.state;
		}
	}
}

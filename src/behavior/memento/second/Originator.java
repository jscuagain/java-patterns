package behavior.memento.second;

/**
 * 发起人角色类，内部定义了一个Memento类，由于此Memento类的全部接口都是私有的，因此只有它自己和发起人对象可以调用。
 */
public class Originator {
	private String state;

	/**
	 * 返回一个新的备忘录对象
	 */
	public MementoIF createMemento() {
		return new Memento(state);
	}

	/**
	 * 将发起人对象恢复到备忘录对象所记录的状态
	 */
	public void restoreOriginator(MementoIF memento) {
		this.state = ((Memento) memento).getState();
	}

	private class Memento implements MementoIF {
		private String state;

		private Memento(String state) {
			this.state = state;
		}

		private String getState() {
			return state;
		}
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("当前状态：" + this.state);
	}
}

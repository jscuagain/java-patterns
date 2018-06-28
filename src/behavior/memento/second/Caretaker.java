package behavior.memento.second;

/**
 * 负责人角色类，得到的备忘录对象是以MementoIF为接口的，由于这个
 * 接口仅仅是一个标识接口，因此负责人对象不可能改变这个备忘录对象的内容。
 */
public class Caretaker {
	private MementoIF memento;

	public MementoIF getMemento() {
		return memento;
	}

	public void setMemento(MementoIF memento) {
		this.memento = memento;
	}

}

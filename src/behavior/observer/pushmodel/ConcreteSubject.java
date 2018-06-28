package behavior.observer.pushmodel;

/**
 * 具体主题角色类
 */
public class ConcreteSubject extends Subject {

	private String subjectState = "state"; // 主题的初始状态

	public String getSubjectState() {
		return subjectState;
	}

	public void change(String newState) {
		System.out.println("主题的初始状态：" + subjectState);
		subjectState = newState;
		System.out.println("改变后的主题状态：" + subjectState);
		nodifyObservers(subjectState); // 状态发生改变后，通知各个观察者更新自己的状态
	}

}

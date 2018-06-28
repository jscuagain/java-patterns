package behavior.observer.pullmodel;

public class ConcreteObserver implements Observer {

	private String observerState = "state"; // 观察者的初始状态

	@Override
	public void update(Subject subject) {
		System.out.println("观察者的初始状态：" + observerState);
		observerState = ((ConcreteSubject) subject).getSubjectState();
		System.out.println("改变后的观察者状态：" + observerState);
	}

}

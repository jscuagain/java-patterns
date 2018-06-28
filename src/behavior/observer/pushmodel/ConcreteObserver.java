package behavior.observer.pushmodel;

public class ConcreteObserver implements Observer {

	private String observerState = "state"; // 观察者的初始状态

	@Override
	public void update(String newState) {
		System.out.println("观察者的初始状态：" + observerState);
		observerState = newState;
		System.out.println("改变后的观察者状态：" + observerState);
	}

}

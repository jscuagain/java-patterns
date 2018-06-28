package behavior.state.second;

public class ConcreteStateA implements State {

	@Override
	public void handle(String param) {
		System.out.println("ConcreteStateA handle: " + param);
	}

}

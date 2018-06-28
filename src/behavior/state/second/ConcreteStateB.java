package behavior.state.second;

public class ConcreteStateB implements State {

	@Override
	public void handle(String param) {
		System.out.println("ConcreteStateB handle: " + param);
	}

}

package behavior.state.first;

public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void m() {
		if ("state1".equals(state.getValue())) {
			state.m1();
		} else if("state2".equals(state.getValue())) {
			state.m2();
		}
	}
}

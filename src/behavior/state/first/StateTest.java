package behavior.state.first;

import org.junit.Test;

public class StateTest {

	@Test
	public void testState() {
		State state = new State();
		Context context = new Context(state);
		
		state.setValue("state1");
		context.m();
		
		state.setValue("state2");
		context.m();
	}
}

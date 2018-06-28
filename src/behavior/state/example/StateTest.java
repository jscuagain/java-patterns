package behavior.state.example;

import org.junit.Test;

public class StateTest {
	@Test
	public void testState() {
		VoteManager vm = new VoteManager();
		for (int i = 0; i < 9; i++) {
			vm.vote("张三", "A");
		}
	}
}

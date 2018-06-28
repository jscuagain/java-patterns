package behavior.state.second;

public class Context {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 用户感兴趣的接口方法
	 */
	public void request(String param) {
		state.handle(param);
	}
}

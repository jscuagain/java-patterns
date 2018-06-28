package behavior.state.first;

public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void m1() {
		System.out.println("m1()");
	}
	
	public void m2() {
		System.out.println("m2()");
	}
}

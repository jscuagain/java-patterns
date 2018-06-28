package behavior.visitor.first;

public class StringElement implements Visitable {

	private String value;

	public StringElement(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}

}

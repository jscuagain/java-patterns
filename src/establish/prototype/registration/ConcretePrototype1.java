package establish.prototype.registration;

public class ConcretePrototype1 implements Prototype {
	
	private String name;

	@Override
	public Prototype clone() {
		return new ConcretePrototype1();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Now in ConcretePrototype1, name=" + name;
	}

}

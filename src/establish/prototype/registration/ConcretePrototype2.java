package establish.prototype.registration;

public class ConcretePrototype2 implements Prototype {
	
	private String name;

	@Override
	public Prototype clone() {
		return new ConcretePrototype2();
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
		return "Now in ConcretePrototype2, name=" + name;
	}

}

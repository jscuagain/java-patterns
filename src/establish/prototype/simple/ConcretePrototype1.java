package establish.prototype.simple;

public class ConcretePrototype1 implements Prototype {

	@Override
	public Prototype clone() {
		return new ConcretePrototype1();
	}
	
	public String toString() {
		return "Now in ConcretePrototype1";
	}

}

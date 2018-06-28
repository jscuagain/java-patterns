package establish.prototype.simple;

public class ConcretePrototype2 implements Prototype {

	@Override
	public Prototype clone() {
		return new ConcretePrototype2();
	}
	
	public String toString() {
		return "Now in ConcretePrototype2";
	}

}

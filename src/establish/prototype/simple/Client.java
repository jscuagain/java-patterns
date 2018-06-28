package establish.prototype.simple;

public class Client {

	private Prototype prototype;

	public Client(Prototype prototype) {
		this.prototype = prototype;
	}

	public Prototype getPrototype() {
		return prototype.clone();
	}

}

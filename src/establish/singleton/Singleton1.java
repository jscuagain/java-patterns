package establish.singleton;

public class Singleton1 {

	private volatile static Singleton1 instance = null;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			synchronized (Singleton1.class) {
				if (instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}

}

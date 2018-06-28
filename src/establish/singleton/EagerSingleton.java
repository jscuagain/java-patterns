package establish.singleton;

/**
 * 饿汉式单例类
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
	
}

package establish.singleton;

/**
 * 懒汉式单例类
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

}

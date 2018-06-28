package structure.flyweight.compositeflyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {

	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	/**
	 * 复合享元工厂方法
	 */
	public Flyweight getCompositeFlyweight(List<Character> compositeStates) {
		ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();

		for (Character state : compositeStates) {
			compositeFly.add(state, getFlyweight(state));
		}

		return compositeFly;
	}

	/**
	 * 单纯享元工厂方法
	 */
	public Flyweight getFlyweight(Character state) {
		Flyweight fly = files.get(state); // 先从缓存中查找对象
		if (fly == null) {
			fly = new ConcreteFlyweight(state);
			files.put(state, fly);
		}
		return fly;
	}

}

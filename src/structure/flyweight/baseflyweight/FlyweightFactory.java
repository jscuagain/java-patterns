package structure.flyweight.baseflyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private Map<Character, Flyweight> files = new HashMap<Character, Flyweight>();

	public Flyweight getFlyweight(Character state) {
		Flyweight fly = files.get(state); // 先从缓存中查找对象
		if (fly == null) {
			fly = new ConcreteFlyweight(state);
			files.put(state, fly);
		}
		return fly;
	}

}

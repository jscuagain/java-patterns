package structure.flyweight.compositeflyweight;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FlyweightTest {

	/**
	 * 1.一个复合享元对象的所有单纯享元对象的外蕴状态与该复合享元对象的外蕴状态相等的，即都是Composite Call。
	 * 2.一个复合享元对象的所有单纯享元对象的内蕴状态一般是不相等的，即分别为b、c、a。
	 * 3.复合享元对象是不能共享的，即使用相同的compositeStates通过工厂两次创建出的对象不是同一个对象。
	 * 4.单纯享元对象是可以共享的，即使用相同的state通过工厂两次创建出的对象是同一个对象。
	 */
	@Test
	public void testFlyweight() {
		List<Character> compositeStates = new ArrayList<Character>();
		compositeStates.add('a');
		compositeStates.add('b');
		compositeStates.add('c');
		compositeStates.add('a');
		compositeStates.add('b');

		FlyweightFactory flyFactory = new FlyweightFactory();
		Flyweight compositeFly1 = flyFactory.getCompositeFlyweight(compositeStates);
		Flyweight compositeFly2 = flyFactory.getCompositeFlyweight(compositeStates);
		compositeFly1.operation("Composite Call");

		System.out.println("===========================");
		System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

		Character state = 'a';
		Flyweight fly1 = flyFactory.getFlyweight(state);
		Flyweight fly2 = flyFactory.getFlyweight(state);
		System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}

}

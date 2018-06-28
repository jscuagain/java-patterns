package behavior.iterator.intrinsiciterator;

import org.junit.Test;

public class IteratorTest {

	public void operation() {
		Object[] objArray = { "One", "Two", "Three", "Four", "Five", "Six" };

		Aggregate agg = new ConcreteAggregate(objArray); // 创建集合对象

		// 循环输出集合对象中的值
		Iterator it = agg.createIterator();
		while (!it.isLast()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}

	@Test
	public void testIterator() {
		IteratorTest test = new IteratorTest();
		test.operation();
	}

}

package establish.prototype.simple;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void testPrototype() {
		Prototype p1 = new ConcretePrototype1();
		Client c1 = new Client(p1);
		Prototype p3 = c1.getPrototype();
		System.out.println("第一个实例：" + p3);

		Prototype p2 = new ConcretePrototype2();
		Client c2 = new Client(p2);
		Prototype p4 = c2.getPrototype();
		System.out.println("第二个实例：" + p4);
	}

}

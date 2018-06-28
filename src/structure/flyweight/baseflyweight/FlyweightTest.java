package structure.flyweight.baseflyweight;

import org.junit.Test;

public class FlyweightTest {

	@Test
	public void testFlyweight() {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.getFlyweight(new Character('a'));
		fly.operation("First Call");

		fly = factory.getFlyweight(new Character('b'));
		fly.operation("Second Call");

		fly = factory.getFlyweight(new Character('a'));
		fly.operation("Third Call");
	}

}

package structure.decorator.second;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testDecorator() {
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		fish.move();
	}

}

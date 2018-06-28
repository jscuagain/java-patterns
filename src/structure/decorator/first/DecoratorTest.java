package structure.decorator.first;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void testDecorator() {
		Component component = new ConcreteComponent();
		Component concreteDecorator = new ConcreteDecorator(component);
		concreteDecorator.operation();
	}

}

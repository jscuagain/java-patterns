package establish.builder.first;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void testBuilder() {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.getProduct();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}

}

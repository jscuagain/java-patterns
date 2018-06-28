package establish.builder.second;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void testBuilder() {
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("fromAddress@126.com", "toAddress@126.com");
	}

}

package establish.simplefactory.second;

import org.junit.Test;

public class SimpleFactoryTest {

	@Test
	public void testSimpleFactory() {
		String loginType = "password";
		String name = "hesj";
		String password = "123321";

		Login login = LoginFactory.produceLogin(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			// 业务逻辑
		} else {
			// 业务逻辑
		}
	}

}

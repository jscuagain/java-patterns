package structure.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void testProxy() {
		Sourceable s = new SourceProxy();
		s.method();
	}

}

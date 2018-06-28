package structure.adapter.classadapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void testAdapter() {
		Target target = new Adapter();
		target.method1();
		target.method2();
	}

}

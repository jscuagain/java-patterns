package structure.adapter.defaultadapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void testAdapter() {
		Target target = new Source();
		target.method1();
		target.method2();
	}

}

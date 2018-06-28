package structure.adapter.objectadapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void testAdapter() {
		Source source = new Source();
		Target target = new Adapter(source);
		target.method1();
		target.method2();
	}

}

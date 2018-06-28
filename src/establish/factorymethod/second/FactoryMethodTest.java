package establish.factorymethod.second;

import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		String data = "要导出的数据";
		ExportFactory exportFactory = new ExportHtmlFactory();
		ExportFile ef = exportFactory.factory("financial");
		ef.export(data);
	}

}

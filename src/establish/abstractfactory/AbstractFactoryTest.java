package establish.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void testAbstractFactory() {
		ComputerEngineer engineer = new ComputerEngineer();
		AbstractFactory factory = new IntelFactory();
		engineer.makeComputer(factory);
	}

}

package establish.simplefactory.first;

import org.junit.Test;

public class SimpleFactoryTest {
	@Test
	public void testSimpleFactory() {
		Sender mailSender = SenderFactory.produceMail();
		mailSender.send();
		
		Sender smsSender = SenderFactory.produceSms();
		smsSender.send();
	}
}

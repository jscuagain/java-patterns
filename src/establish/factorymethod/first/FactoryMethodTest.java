package establish.factorymethod.first;

import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void testFactoryMethod() {
		SenderFactory mailFactory = new MailSenderFactory();
		Sender mail = mailFactory.produceSender();
		mail.send();

		SenderFactory smsFactory = new SmsSenderFactory();
		Sender sms = smsFactory.produceSender();
		sms.send();
	}

}

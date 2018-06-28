package establish.factorymethod.first;

public class MailSenderFactory implements SenderFactory {

	@Override
	public Sender produceSender() {
		return new MailSender();
	}

}

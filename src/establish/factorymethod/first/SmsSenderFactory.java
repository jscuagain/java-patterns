package establish.factorymethod.first;

public class SmsSenderFactory implements SenderFactory {

	@Override
	public Sender produceSender() {
		return new SmsSender();
	}

}

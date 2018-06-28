package establish.builder.second;

public class GoodbyeBuilder extends Builder {

	public GoodbyeBuilder() {
		mail = new GoodbyeMail();
	}

	@Override
	public void buildSubject() {
		mail.setSubject("欢送标题");
	}

	@Override
	public void buildBody() {
		mail.setBody("欢送内容");
	}

}

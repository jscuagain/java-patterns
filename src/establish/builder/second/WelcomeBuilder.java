package establish.builder.second;

public class WelcomeBuilder extends Builder {

	public WelcomeBuilder() {
		mail = new WelcomeMail();
	}

	@Override
	public void buildSubject() {
		mail.setSubject("欢迎标题");
	}

	@Override
	public void buildBody() {
		mail.setBody("欢迎内容");
	}

}

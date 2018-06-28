package establish.builder.second;

import java.util.Date;

public abstract class Builder {

	protected AutoMail mail;

	public abstract void buildSubject(); // 建造标题零件

	public abstract void buildBody(); // 建造内容零件

	/**
	 * 建造发件人零件
	 */
	public void buildFrom(String from) {
		mail.setFrom(from);
	}

	/**
	 * 建造收件人零件
	 */
	public void buildTo(String to) {
		mail.setTo(to);
	}

	/**
	 * 建造发送日期零件
	 */
	public void buildSendDate() {
		mail.setSendDate(new Date());
	}

	/**
	 * 邮件产品完成后，用此方法发送邮件，此方法相当于获取产品方法
	 */
	public void sendMail() {
		mail.sendMail();
	}

}

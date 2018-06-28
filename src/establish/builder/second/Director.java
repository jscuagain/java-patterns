package establish.builder.second;

public class Director {

	Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 产品建造方法，负责调用各个零件的建造方法
	 */
	public void construct(String fromAddress, String toAddress) {
		builder.buildFrom(fromAddress);
		builder.buildTo(toAddress);
		builder.buildSubject();
		builder.buildBody();
		builder.buildSendDate();
		builder.sendMail();
	}

}

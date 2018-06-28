package establish.builder.first;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 产品的创建方法
	 */
	public void construct() {
		builder.buildPart1();
		builder.buildPart2();
	}

}

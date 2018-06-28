package establish.builder.first;

public interface Builder {

	/**
     * 构建产品的第一个零件
     */
	void buildPart1();

	/**
     * 构建产品的第二个零件
     */
	void buildPart2();

	/**
	 * 获取产品
	 */
	Product getProduct();

}

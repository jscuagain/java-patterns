package behavior.strategy.second;

public interface DiscountStrategy {

	/**
	 * 计算打折后图书的价格
	 * 
	 * @param booksPrice
	 *            图书的原价
	 * @return 打折后的价格
	 */
	double calcPrice(double booksPrice);

}

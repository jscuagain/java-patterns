package behavior.strategy.second;

public class Price {

	private DiscountStrategy strategy;

	public Price(DiscountStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 计算打折后图书的价格
	 * 
	 * @param booksPrice
	 *            图书的原价
	 * @return 打折后的价格
	 */
	public double quote(double booksPrice) {
		return strategy.calcPrice(booksPrice);
	}

}

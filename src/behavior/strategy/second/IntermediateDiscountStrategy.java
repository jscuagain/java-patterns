package behavior.strategy.second;

/**
 * 中级会员折扣类
 */
public class IntermediateDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("中级会员的折扣为10%");
		return booksPrice * 0.9;
	}

}

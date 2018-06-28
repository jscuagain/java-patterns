package behavior.strategy.second;

/**
 * 高级会员折扣类
 */
public class AdvancedDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("高级会员的折扣为20%");
		return booksPrice * 0.8;
	}

}

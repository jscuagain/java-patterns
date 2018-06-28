package behavior.strategy.second;

/**
 * 初级会员折扣类
 */
public class PrimaryDiscountStrategy implements DiscountStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("初级会员不享受折扣");
		return booksPrice;
	}

}

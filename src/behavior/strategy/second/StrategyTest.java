package behavior.strategy.second;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testStrategy() {
		double booksPrice = 100.0; // 图书的原价
		
		DiscountStrategy primaryStrategy = new PrimaryDiscountStrategy();
		Price primaryPrice = new Price(primaryStrategy);
		double price1 = primaryPrice.quote(booksPrice);
		System.out.println("初级会员购买图书需要付费：" + price1);
		
		DiscountStrategy intermediateStrategy = new IntermediateDiscountStrategy();
		Price intermediatePrice = new Price(intermediateStrategy);
		double price2 = intermediatePrice.quote(booksPrice);
		System.out.println("中级会员购买图书需要付费：" + price2);
		
		DiscountStrategy advancedStrategy = new AdvancedDiscountStrategy();
		Price advancedPrice = new Price(advancedStrategy);
		double price3 = advancedPrice.quote(booksPrice);
		System.out.println("高级会员购买图书需要付费：" + price3);
	}

}

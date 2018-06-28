package behavior.templatemethod.second;

import org.junit.Test;

public class TemplateMethodTest {
	@Test
	public void testTemplateMethod() {
		Account account = new MoneyMarketAccount();
		System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
		
		account = new CDAccount();
		System.out.println("定期存款账号的利息数额为：" + account.calculateInterest());
	}
}

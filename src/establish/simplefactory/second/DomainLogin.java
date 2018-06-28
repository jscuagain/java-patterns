package establish.simplefactory.second;

public class DomainLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		// 业务逻辑

		System.out.println("DomainLogin");
		return true;
	}

}

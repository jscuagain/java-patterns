package establish.simplefactory.second;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		// 业务逻辑

		System.out.println("PasswordLogin");
		return true;
	}

}

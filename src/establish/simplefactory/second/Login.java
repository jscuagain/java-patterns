package establish.simplefactory.second;

public interface Login {

	/**
	 * 登录验证
	 * 
	 * @param name
	 *            用户名
	 * @param password
	 *            密码
	 * @return 是否已登录
	 */
	boolean verify(String name, String password);

}

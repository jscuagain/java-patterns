package structure.facade;

/**
 * 子系统内部的ModuleA模块
 */
public class ModuleA {

	/**
	 * 提供给子系统外部使用的方法
	 */
	public void a1() {
		System.out.println("ModuleA模块提供给子系统外部使用的方法：a1");
	};

	/**
	 * 子系统内部模块之间相互调用时使用的方法
	 */
	public void a2() {
		// 业务逻辑
	};

}

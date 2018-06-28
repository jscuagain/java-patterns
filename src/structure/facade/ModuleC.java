package structure.facade;

/**
 * 子系统内部的ModuleC模块
 */
public class ModuleC {

	/**
	 * 提供给子系统外部使用的方法
	 */
	public void c1() {
		System.out.println("ModuleC模块提供给子系统外部使用的方法：c1");
	};

	/**
	 * 子系统内部模块之间相互调用时使用的方法
	 */
	public void c2() {
		// 业务逻辑
	};

}

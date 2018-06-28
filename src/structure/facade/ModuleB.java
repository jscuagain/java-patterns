package structure.facade;

/**
 * 子系统内部的ModuleB模块
 */
public class ModuleB {

	/**
	 * 提供给子系统外部使用的方法
	 */
	public void b1() {
		System.out.println("ModuleB模块提供给子系统外部使用的方法：b1");
	};

	/**
	 * 子系统内部模块之间相互调用时使用的方法
	 */
	public void b2() {
		// 业务逻辑
	};

}

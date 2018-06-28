package structure.facade;

public class Facade {

	ModuleA a = new ModuleA();
	ModuleB b = new ModuleB();
	ModuleC c = new ModuleC();

	/**
	 * 子系统内部的ModuleA模块提供给子系统外部使用的方法
	 */
	public void a1() {
		a.a1();
	}

	/**
	 * 子系统内部的ModuleB模块提供给子系统外部使用的方法
	 */
	public void b1() {
		b.b1();
	}

	/**
	 * 子系统内部的ModuleC模块提供给子系统外部使用的方法
	 */
	public void c1() {
		c.c1();
	}

}

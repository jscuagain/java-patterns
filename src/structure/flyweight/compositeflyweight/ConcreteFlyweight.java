package structure.flyweight.compositeflyweight;

public class ConcreteFlyweight implements Flyweight {

	private Character innerState = null; // 内蕴状态

	public ConcreteFlyweight(Character innerState) {
		this.innerState = innerState;
	}

	/**
	 * 外蕴状态作为参数传入方法中，改变方法的行为，不改变对象的内蕴状态。
	 */
	@Override
	public void operation(String outerState) {
		System.out.println("innerState=" + innerState);
		System.out.println("outerState=" + outerState);
	}

}

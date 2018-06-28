package establish.abstractfactory;

public class IntelMainboard implements Mainboard {

	/**
	 * CPU插槽的孔数
	 */
	private int cpuHoles = 0;

	public IntelMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU() {
		System.out.println("Intel主板的CPU插槽孔数：" + cpuHoles);
	}

}

package establish.abstractfactory;

public class ComputerEngineer {

	private Cpu cpu = null;
	
	private Mainboard mainboard = null;

	public void makeComputer(AbstractFactory af) {
		prepareHardwares(af); // 1.准备好装机所需要的配件
		// 2.组装机器
		// 3.测试机器
		// 4.交付客户
	}

	private void prepareHardwares(AbstractFactory af) {
		cpu = af.createCpu();
		mainboard = af.createMainboard();

		// 测试配件是否好用
		cpu.calculate();
		mainboard.installCPU();
	}

}

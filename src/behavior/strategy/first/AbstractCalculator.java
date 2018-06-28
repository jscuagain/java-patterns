package behavior.strategy.first;

public abstract class AbstractCalculator {

	public int[] split(String exp, String opt) {
		String[] ss = exp.split(opt);
		int[] arr = new int[2];
		arr[0] = Integer.parseInt(ss[0]);
		arr[1] = Integer.parseInt(ss[1]);
		return arr;
	}

}

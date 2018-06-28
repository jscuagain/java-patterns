package behavior.templatemethod.first;

public abstract class AbstractCalculator {
	public final int calculate(String exp, String opt) {
		int[] arr = split(exp, opt);
		return calculate(arr[0], arr[1]);
	}

	public int[] split(String exp, String opt) {
		String[] ss = exp.split(opt);
		int[] arr = new int[2];
		arr[0] = Integer.parseInt(ss[0]);
		arr[1] = Integer.parseInt(ss[1]);
		return arr;
	}

	public abstract int calculate(int num1, int num2);
}

package behavior.strategy.first;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int[] arr = split(exp, "-");
		return arr[0] - arr[1];
	}

}

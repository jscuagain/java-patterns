package structure.decorator.second;

/**
 * 大圣变化成的鸟儿（装饰者）
 */
public class Bird extends Change {

	public Bird(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		System.out.println("Bird move");
	}

}

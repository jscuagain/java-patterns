package structure.decorator.second;

/**
 * 大圣变化成的鱼儿（装饰者）
 */
public class Fish extends Change {

	public Fish(TheGreatestSage sage) {
		super(sage);
	}

	@Override
	public void move() {
		System.out.println("Fish move");
	}

}

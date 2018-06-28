package structure.decorator.second;

/**
 * 七十二般变化
 */
public class Change implements TheGreatestSage {

	private TheGreatestSage sage;

	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	@Override
	public void move() {
		sage.move();
	}

}

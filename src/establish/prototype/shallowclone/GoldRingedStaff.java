package establish.prototype.shallowclone;

/**
 * 金箍棒
 */
public class GoldRingedStaff {

	private float height = 100.0F;
	private float diameter = 10.0F;

	/**
	 * 增长行为，每调用一次，长度和直径增加一倍
	 */
	public void grow() {
		height *= 2;
		diameter *= 2;
	}

	/**
	 * 缩小行为，每调用一次，长度和直径减少一半
	 */
	public void shrink() {
		height /= 2;
		diameter /= 2;
	}

}

package behavior.iterator.extrinsiciterator;

/**
 * 迭代子接口
 */
public interface Iterator {

	/**
	 * 移动到第一个元素
	 */
	void first();

	/**
	 * 移动到下一个元素
	 */
	void next();

	/**
	 * 是否为最后一个元素
	 */
	boolean isLast();

	/**
	 * 返还当前元素
	 */
	Object currentItem();

}

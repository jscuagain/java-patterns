package behavior.iterator.extrinsiciterator;

/**
 * 具体迭代子角色类
 */
public class ConcreteIterator implements Iterator {

	private ConcreteAggregate agg; // 持有被迭代的具体的集合对象

	private int index; // 记录当前迭代到的索引位置

	private int size; // 记录当前集合对象的大小

	public ConcreteIterator(ConcreteAggregate agg) {
		this.agg = agg;
		size = agg.size();
		index = 0;
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < size) {
			index++;
		}
	}

	@Override
	public boolean isLast() {
		return (index >= size);
	}

	@Override
	public Object currentItem() {
		return agg.getElement(index);
	}

}

package behavior.iterator.extrinsiciterator;

public class ConcreteAggregate extends Aggregate {

	private Object[] objArray = null;

	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	/**
	 * 向外界提供数组元素
	 */
	public Object getElement(int index) {
		if (index < objArray.length) {
			return objArray[index];
		} else {
			return null;
		}
	}

	/**
	 * 向外界提供数组的大小
	 */
	public int size() {
		return objArray.length;
	}

}

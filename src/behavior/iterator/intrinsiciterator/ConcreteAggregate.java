package behavior.iterator.intrinsiciterator;

public class ConcreteAggregate extends Aggregate {

	private Object[] objArray = null;

	public ConcreteAggregate(Object[] objArray) {
		this.objArray = objArray;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator();
	}

	/**
	 * 内部成员类，具体迭代子类
	 */
	private class ConcreteIterator implements Iterator {

		private int index; // 记录当前迭代到的索引位置
		private int size; // 记录当前集合对象的大小

		public ConcreteIterator() {
			index = 0;
			size = objArray.length;
		}

		@Override
		public Object currentItem() {
			return objArray[index];
		}

		@Override
		public void first() {
			index = 0;
		}

		@Override
		public boolean isLast() {
			return (index >= size);
		}

		@Override
		public void next() {
			if (index < size) {
				index++;
			}
		}

	}

}

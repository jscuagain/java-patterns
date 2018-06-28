package behavior.iterator.first;

public class MyCollection implements Collection {
	
	public String[] ss = {"A", "B", "C", "D", "E"};
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return ss[i];
	}

	@Override
	public int size() {
		return ss.length;
	}

}

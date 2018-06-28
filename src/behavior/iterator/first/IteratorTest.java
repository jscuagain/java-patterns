package behavior.iterator.first;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void testIterator() {
		
		Collection col = new MyCollection();
		Iterator it = col.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}

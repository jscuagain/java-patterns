package behavior.visitor.first;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void testVisitor() {
		Visitor visitor = new ConcreteVisitor();

		Collection<Visitable> list = new ArrayList<Visitable>();
		list.add(new StringElement("I am a String1"));
		list.add(new StringElement("I am a String2"));
		list.add(new FloatElement(new Float(12)));
		list.add(new StringElement("I am a String3"));
		visitor.visitCollection(list);
	}
}

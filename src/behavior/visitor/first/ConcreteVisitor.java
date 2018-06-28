package behavior.visitor.first;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {
	@Override
	public void visitString(StringElement stringElement) {
		System.out.println(stringElement.getValue());

	}

	@Override
	public void visitFloat(FloatElement floatElement) {
		System.out.println(floatElement.getValue().toString() + "F");

	}

	@Override
	public void visitCollection(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Visitable) {
				((Visitable) obj).accept(this);
			}
		}
	}
}

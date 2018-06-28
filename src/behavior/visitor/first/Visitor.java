package behavior.visitor.first;

import java.util.Collection;

public interface Visitor {

	void visitString(StringElement stringElement);

	void visitFloat(FloatElement floatElement);

	void visitCollection(Collection collection);

}

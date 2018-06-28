package behavior.visitor.second;

import org.junit.Test;

public class VisitorTest {
	@Test
	public void testVisitor() {
		ObjectStructure os = new ObjectStructure();
		os.add(new NodeA());
		os.add(new NodeB());
		Visitor visitor = new VisitorA(); // 创建一个访问者
		os.action(visitor);
	}
}

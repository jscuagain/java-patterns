package structure.composite.safemode;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void testComposite() {
		Composite root = new Composite("服装");
		Composite root1 = new Composite("男装");
		Composite root2 = new Composite("女装");

		Leaf root11 = new Leaf("衬衫");
		Leaf root12 = new Leaf("夹克");
		Leaf root21 = new Leaf("裙子");
		Leaf root22 = new Leaf("套装");

		root.addChild(root1);
		root.addChild(root2);
		root1.addChild(root11);
		root1.addChild(root12);
		root2.addChild(root21);
		root2.addChild(root22);

		root.printStruct("");
	}

}

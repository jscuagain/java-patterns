package structure.composite.transparentmode;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void testComposite() {
		Component root = new Composite("服装");
		Component root1 = new Composite("男装");
		Component root2 = new Composite("女装");

		Component root11 = new Leaf("衬衫");
		Component root12 = new Leaf("夹克");
		Component root21 = new Leaf("裙子");
		Component root22 = new Leaf("套装");

		root.addChild(root1);
		root.addChild(root2);
		root1.addChild(root11);
		root1.addChild(root12);
		root2.addChild(root21);
		root2.addChild(root22);

		root.printStruct("");
	}

}

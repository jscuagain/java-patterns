package behavior.visitor.second;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Node> nodes = new ArrayList<Node>();

	public void action(Visitor visitor) {
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}

	/**
	 * 添加一个新元素
	 */
	public void add(Node node) {
		nodes.add(node);
	}
}

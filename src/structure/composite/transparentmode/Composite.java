package structure.composite.transparentmode;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝
 */
public class Composite extends Component {

	// 用来存储组件对象中包含的子组件对象
	private List<Component> childComponents = new ArrayList<Component>();

	private String name;

	public Composite(String name) {
		this.name = name;
	}

	/**
	 * 增加一个子组件对象
	 * 
	 * @param child
	 *            子组件对象
	 */
	public void addChild(Component child) {
		childComponents.add(child);
	}

	/**
	 * 删除一个子组件对象
	 * 
	 * @param index
	 *            子组件对象的下标
	 */
	public void removeChild(int index) {
		childComponents.remove(index);
	}

	/**
	 * 返回所有子组件对象
	 */
	public List<Component> getChildren() {
		return childComponents;
	}

	/**
	 * 输出树枝对象的结构
	 * 
	 * @param preStr
	 *            前缀，主要是按照层级拼接空格，实现向后缩进
	 */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "+" + name); // 先把自己输出
		
		if (childComponents != null) {
			preStr += "  "; // 向后缩进两个空格
			
			for (Component c : childComponents) {
				c.printStruct(preStr);
			}
		}
	}

}

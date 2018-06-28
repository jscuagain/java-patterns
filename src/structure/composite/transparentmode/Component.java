package structure.composite.transparentmode;

import java.util.List;

public abstract class Component {

	/**
	 * 输出组件对象的结构
	 */
	public abstract void printStruct(String preStr);

	/**
	 * 增加一个子组件对象
	 * 
	 * @param child
	 *            子组件对象
	 */
	public void addChild(Component child) {
		// 缺省实现，抛出异常，因为树叶对象没有此功能或子组件对象没有实现此功能
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 删除一个子组件对象
	 * 
	 * @param index
	 *            子组件对象的下标
	 */
	public void removeChild(int index) {
		// 缺省实现，抛出异常，因为树叶对象没有此功能或子组件对象没有实现此功能
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 返回所有子组件对象
	 */
	public List<Component> getChildren() {
		// 缺省实现，抛出异常，因为树叶对象没有此功能或子组件对象没有实现此功能
		throw new UnsupportedOperationException("对象不支持此功能");
	}

}

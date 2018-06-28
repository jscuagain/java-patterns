package structure.composite.transparentmode;

/**
 * 树叶
 */
public class Leaf extends Component {

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	/**
	 * 输出树叶对象的结构
	 * 
	 * @param preStr
	 *            前缀，主要是按照层级拼接空格，实现向后缩进
	 */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + "-" + name);
	}

}

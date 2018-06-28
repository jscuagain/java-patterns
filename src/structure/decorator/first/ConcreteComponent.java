package structure.decorator.first;

public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("业务逻辑");
	}

}

package structure.proxy;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("业务逻辑");
	}

}

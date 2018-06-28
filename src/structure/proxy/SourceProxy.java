package structure.proxy;

public class SourceProxy implements Sourceable {

	private Sourceable source;

	public SourceProxy() {
		source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("before");
	}

	private void after() {
		System.out.println("after");
	}

}

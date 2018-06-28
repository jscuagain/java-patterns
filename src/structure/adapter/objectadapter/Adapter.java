package structure.adapter.objectadapter;

public class Adapter implements Target {

	private Source source;

	public Adapter(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("target method");
	}

}

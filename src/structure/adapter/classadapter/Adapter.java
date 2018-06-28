package structure.adapter.classadapter;

public class Adapter extends Source implements Target {

	@Override
	public void method2() {
		System.out.println("target method");		
	}

}

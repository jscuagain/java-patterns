package behavior.observer.pushmodel;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void testObserver() {
		ConcreteSubject subject = new ConcreteSubject(); // 创建主题对象
		Observer observer = new ConcreteObserver(); // 创建观察者对象
		subject.attach(observer); // 将观察者对象登记到主题对象上
		subject.change("new state"); // 改变主题对象的状态
	}

}

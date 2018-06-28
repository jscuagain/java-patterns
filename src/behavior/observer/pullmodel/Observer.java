package behavior.observer.pullmodel;

/**
 * 观察者接口
 */
public interface Observer {

	/**
	 * 更新观察者的状态，使其与主题对象的状态保持一致
	 * 
	 * @param subject
	 *            主题对象
	 */
	void update(Subject subject);

}

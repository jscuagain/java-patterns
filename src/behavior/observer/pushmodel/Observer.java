package behavior.observer.pushmodel;

/**
 * 观察者接口
 */
public interface Observer {

	/**
	 * 更新观察者的状态，使其与目标状态保持一致
	 * 
	 * @param state
	 *            状态
	 */
	void update(String newState);

}

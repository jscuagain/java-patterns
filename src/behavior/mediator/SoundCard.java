package behavior.mediator;

/**
 * 声卡
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 播放音频数据
	 */
	public void showData(String data) {
		System.out.println("画外音：" + data);
	}

}

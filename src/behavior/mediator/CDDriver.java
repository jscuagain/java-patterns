package behavior.mediator;

/**
 * 光驱
 */
public class CDDriver extends Colleague {

	private String data = "";

	public CDDriver(Mediator mediator) {
		super(mediator);
	}
	
	/**
	 * 读取光盘
	 */
	public void readCD() {
		data = "One Piece,海贼王我当定了"; // 逗号前是视频数据，逗号后是音频数据
		getMediator().changed(this); // 通知主板，自己完成了工作
	}

	public String getData() {
		return data;
	}

}

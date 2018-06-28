package behavior.mediator;

public class CPU extends Colleague {

	private String videoData = ""; // 分解出来的视频数据

	private String soundData = ""; // 分解出来的音频数据

	public CPU(Mediator mediator) {
		super(mediator);
	}

	/**
	 * 处理数据，把数据分成视频数据和音频数据
	 */
	public void executeData(String data) {
		String[] array = data.split(",");
		videoData = array[0];
		soundData = array[1];
		
		getMediator().changed(this); // 通知主板，自己完成了工作
	}

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}

}

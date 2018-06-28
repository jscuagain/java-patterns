package behavior.mediator;

/**
 * 主板
 */
public class MainBoard implements Mediator {

	private CDDriver cdDriver = null;

	private CPU cpu = null;

	private VideoCard videoCard = null;

	private SoundCard soundCard = null;

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	@Override
	public void changed(Colleague c) {
		if (c instanceof CDDriver) {
			opeCDDriverReadData((CDDriver) c); // 表示光驱读取数据了
		} else if (c instanceof CPU) {
			opeCPU((CPU) c);
		}
	}

	/**
	 * 处理光驱读取数据以后与其他对象的交互
	 */
	private void opeCDDriverReadData(CDDriver cd) {
		String data = cd.getData(); // 先获取光驱读取的数据
		cpu.executeData(data); // 把这些数据传递给CPU进行处理
	}

	/**
	 * 处理CPU处理完数据后与其他对象的交互
	 */
	private void opeCPU(CPU cpu) {
		// 获取CPU处理后的数据
		String videoData = cpu.getVideoData();
		String soundData = cpu.getSoundData();

		// 把这些数据传递给显卡和声卡展示
		videoCard.showData(videoData);
		soundCard.showData(soundData);
	}

}

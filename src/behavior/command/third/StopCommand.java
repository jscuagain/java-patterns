package behavior.command.third;

public class StopCommand implements Command {
	private AudioPlayer player = null;
	
	public StopCommand(AudioPlayer player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.stop();
	}

}

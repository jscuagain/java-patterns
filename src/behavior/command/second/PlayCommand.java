package behavior.command.second;

public class PlayCommand implements Command {
	private AudioPlayer player = null;
	
	public PlayCommand(AudioPlayer player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.play();
	}

}

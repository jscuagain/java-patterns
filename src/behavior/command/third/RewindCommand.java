package behavior.command.third;

public class RewindCommand implements Command {
	private AudioPlayer player = null;
	
	public RewindCommand(AudioPlayer player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.rewind();
	}

}


public class JumpCommand implements Command{ //extension of command class which details what specific command does
	public JumpCommand(Player player) {
	}
	public void execute() {
		System.out.println("Our hero jumps over a tall building");
	}
}

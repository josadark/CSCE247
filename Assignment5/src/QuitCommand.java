
public class QuitCommand implements Command{ //extension of command class which details what specific command does
	public QuitCommand() {
		
	}
	public void execute() {
		System.out.println("Game over :(");
	}
}

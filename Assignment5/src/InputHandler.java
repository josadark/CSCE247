import java.util.HashMap;

public class InputHandler { //handles all input

	HashMap<String, Command> commands;//hashmap
	Player player;
	public InputHandler(Player player) {
		commands = new HashMap<String, Command>();
		this.player = player;
		commands.put("quit", new QuitCommand());
		commands.put("jump", new JumpCommand(player));
		commands.put("fire", new FireCommand(player));
		commands.put("run", new RunCommand(player));
	}
	public void buttonPressed(String button) {//when a butotn is pressed updates using hashmap
		commands.get(button).execute();
	}
	
}

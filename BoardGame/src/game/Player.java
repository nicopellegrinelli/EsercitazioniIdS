package game;

public class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void playTurn() {
		System.out.println(name + " is taking their turn...");
	}

}

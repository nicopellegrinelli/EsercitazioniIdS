package game;

public class WarriorPlayer extends Player {
	private int damage;

	public WarriorPlayer(String name, int damage) {
		super(name);
		this.damage = damage;
	}
	
	@Override
	public void playTurn() {
		super.playTurn();
		System.out.println("-> dealing " + this.damage + " damage ");
	}

}

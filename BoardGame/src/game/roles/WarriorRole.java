package game.roles;

public class WarriorRole implements Role{
	private int damage;

	public WarriorRole(int damage) {
		this.damage = damage;
	}
	

	@Override
	public void act() {
		System.out.println("-> dealing " + this.damage + " damage ");
	}

}

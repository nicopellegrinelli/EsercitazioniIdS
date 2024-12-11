package game;

import game.roles.Role;

public class Player {
	private String name;
	private Role role;

	public Player(String name) {
		this.name = name;
		this.role = null;
	}

	public String getName() {
		return name;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public void playTurn() {
		System.out.println(name + " is taking their turn...");
		if (role == null)
			System.out.println("-> no role assigned, skip turn");
		else
			role.act();
	}

}

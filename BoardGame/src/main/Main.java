package main;

import java.util.Arrays;

import game.*;
import game.roles.WarriorRole;
import game.roles.WizardRole;

public class Main {

	public static void main(String[] args) {
		Player p1 = new Player("player1");
		p1.setRole(new WarriorRole(10));
		Player p2 = new Player("player2");
		
		GameEngine.getInstance().addPlayer(p1);
		GameEngine.getInstance().addPlayer(p2);
		
		GameEngine.getInstance().startGame();
		
		GameEngine.getInstance().nextTurn();
		
		p1.setRole(new WizardRole(Arrays.asList(new String[] {"spell1", "spell2"})));
		
		GameEngine.getInstance().nextTurn();
		
		System.out.println("Max players: " + GameEngine.getInstance().getConfiguration().getMaxPlayers());
	}

}

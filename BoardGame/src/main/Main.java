package main;

import java.util.Arrays;

import game.*;

public class Main {

	public static void main(String[] args) {
		GameEngine ge = new GameEngine();
		ge.addPlayer(new WarriorPlayer("player1", 10));
		ge.addPlayer(new WizardPlayer("player2", Arrays.asList(new String[] {"spell1", "spell2"})));
		ge.startGame();
		ge.nextTurn();
	}

}

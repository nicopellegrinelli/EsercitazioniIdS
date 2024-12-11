package game;

import java.util.ArrayList;
import java.util.List;

public class GameEngine {

	private List<Player> players = new ArrayList<>();
	private GameConfiguration configuration;

	public GameEngine() {
		this.configuration = new GameConfiguration();
	}

	public void addPlayer(Player p) {
		players.add(p);
	}

	public void startGame() {
		System.out.println("Game started with players: " + players.size());
	}

	public void nextTurn() {
		for (Player p : players) {
			p.playTurn();
		}
	}

	public GameConfiguration getConfiguration() {
		return configuration;
	}
}

package game;

import java.util.ArrayList;
import java.util.List;

import game.configuration.GameConfiguration;
import game.configuration.GameConfigurationReadOnly;

public class GameEngine {
	private static GameEngine instance;

	private List<Player> players = new ArrayList<>();
	private GameConfiguration configuration;

	private GameEngine() {
		this.configuration = new GameConfiguration();
	}
	
	public static GameEngine getInstance() {
		if (instance == null)
			instance = new GameEngine();
		return instance;
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

	public GameConfigurationReadOnly getConfiguration() {
		return configuration;
	}
}

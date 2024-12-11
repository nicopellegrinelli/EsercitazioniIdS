package game;

public class GameConfiguration {
	private int maxPlayers = 4;
	private int boardSize = 8;

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setMaxPlayer(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

}

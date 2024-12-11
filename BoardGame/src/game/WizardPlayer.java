package game;

import java.util.List;

public class WizardPlayer extends Player {
	private List<String> spells;

	public WizardPlayer(String name, List<String> spells) {
		super(name);
		this.spells = spells;
	}
	
	@Override
	public void playTurn() {
		super.playTurn();
		for (String spell: spells)
			System.out.println("-> casting spell " + spell);
	}

}

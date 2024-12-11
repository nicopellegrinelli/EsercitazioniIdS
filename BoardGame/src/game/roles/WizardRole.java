package game.roles;

import java.util.List;

public class WizardRole implements Role {
	private List<String> spells;

	public WizardRole(List<String> spells) {
		this.spells = spells;
	}
	
	@Override
	public void act() {
		for (String spell: spells)
			System.out.println("-> casting spell " + spell);
	}

}

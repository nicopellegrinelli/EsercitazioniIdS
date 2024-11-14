package model.entities;

public class PremiumCustomer extends Customer{
	public enum Level {
		GOLD, SILVER, BRONZE
	}
	
	private Level level;

	public PremiumCustomer(String id, String dob, String name, Level level) {
		super(id, dob, name);
		this.level = level;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += " -- level: " + level.toString();
		return result;
	}

}

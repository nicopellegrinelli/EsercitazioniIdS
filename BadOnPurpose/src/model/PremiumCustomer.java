package model;

public class PremiumCustomer extends Customer{
	public enum Level {
		GOLD, SILVER, BRONZE
	}
	
	private Level level;

	public PremiumCustomer(String id, String dob, String name, Level level) {
		super(id, dob, name);
		this.level = level;
	}
	
	public String toString() {
		String result = "";
		result += id;
		result += ": ";
		result += name;
		result += ", ";
		result += dob;
		result += " -- level: " + level.toString();
		return result;
	}

}

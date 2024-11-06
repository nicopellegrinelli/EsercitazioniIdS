package model;

public class Customer {
    protected String id;
    protected String dob;
    protected String name;

	public Customer(String id, String dob, String name) {
        this.id = id;
        this.dob = dob;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
	public String toString() {
		String result = "";
		result += id;
		result += ": ";
		result += name;
		result += ", ";
		result += dob;
		return result;
	}
	
}
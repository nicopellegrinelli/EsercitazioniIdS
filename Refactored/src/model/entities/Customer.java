package model.entities;

import model.interfaces.ICustomer;

public class Customer implements ICustomer {
    protected String id;
    protected String dob;
    protected String name;

	public Customer(String id, String dob, String name) {
        this.id = id;
        this.dob = dob;
        this.name = name;
    }

    @Override
	public String getId() {
        return id;
    }
    
	@Override
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
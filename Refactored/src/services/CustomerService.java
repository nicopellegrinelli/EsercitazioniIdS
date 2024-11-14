package services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Customer;
import model.entities.PremiumCustomer;
import model.entities.PremiumCustomer.Level;
import model.interfaces.ICustomer;

public class CustomerService {
	private static CustomerService instance;
	
	public static CustomerService getInstance() {
		if (instance == null)
			instance = new CustomerService();
		return instance;
	}
	
	private CustomerService() {
		super();
	}
	
    private List<ICustomer> customers = new ArrayList<>();

	public void addCustomer(String id, String dob, String name) {
		customers.add(new Customer(id, dob, name));
	}
	
	public void addPremiumCustomer(String id, String dob, String name, Level level) {
		customers.add(new PremiumCustomer(id, dob, name, level));
	}
	public ICustomer getCustomer(String customerId) {
		for (ICustomer c : customers) {
			if (c.getId().equals(customerId))
				return c;
		}
		return null;
	}

}

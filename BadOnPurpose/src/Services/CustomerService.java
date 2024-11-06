package Services;

import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.PremiumCustomer;
import model.PremiumCustomer.Level;

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
	
    private List<Customer> customers = new ArrayList<>();

	public void addCustomer(String id, String dob, String name) {
		customers.add(new Customer(id, dob, name));
	}
	
	public void addPremiumCustomer(String id, String dob, String name, Level level) {
		customers.add(new PremiumCustomer(id, dob, name, level));
	}

	public Customer getCustomer(String customerId) {
		for (Customer c : customers) {
			if (c.getId() == customerId)
				return c;
		}
		return null;
	}

}

package Services;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

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

	public void addCustomer(String id) {
		customers.add(new Customer(id));
	}

	public Customer getCustomer(String customerId) {
		for (Customer c : customers) {
			if (c.getId() == customerId)
				return c;
		}
		return null;
	}

}

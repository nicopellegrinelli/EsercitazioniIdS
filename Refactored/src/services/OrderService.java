package services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Order;
import model.interfaces.IOrder;

public class OrderService {
	private static OrderService instance;
	
	public static OrderService getInstance() {
		if (instance == null)
			instance = new OrderService();
		return instance;
	}
	
	private OrderService() {
		super();
	}
	
	private CustomerService cs = CustomerService.getInstance();
	private ProductService ps = ProductService.getInstance();
    private List<IOrder> orders = new ArrayList<>();

	public void addOrder(int orderId, String customerId, String productName, int quantity)  {
		orders.add(new Order(orderId, cs.getCustomer(customerId), ps.getProduct(productName), quantity));
	}
	
    public String toString() {
    	StringBuilder bld = new StringBuilder();
    	bld.append("Orders:\n");
		for (IOrder o : orders) {
			bld.append(o.toString());
		}
		return bld.toString();
    }

}
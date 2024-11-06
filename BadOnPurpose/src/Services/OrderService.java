package Services;

import java.util.ArrayList;
import java.util.List;

import model.Order;

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
	
    private List<Order> Orders = new ArrayList<>();

	public void addOrder(int orderId, String customerId, String productName, int quantity)  {
		Orders.add(new Order(orderId, customerId, productName, quantity));
	}

	public List<Order> getOrders() {
		return Orders;
	}

}
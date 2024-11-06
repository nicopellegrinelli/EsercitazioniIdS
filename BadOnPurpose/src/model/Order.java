package model;

import Services.CustomerService;
import Services.ProductService;
import utils.Utils;

public class Order {
	private CustomerService cs = CustomerService.getInstance();
	private ProductService ps = ProductService.getInstance();
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    public int total;

    public Order(int orderId, String customerId, String productName, int quantity) {
        this.orderId = orderId;
        this.customer = cs.getCustomer(customerId);
        this.product = ps.getProduct(productName);
        this.quantity = quantity;
        this.total = Utils.getTotal(product, quantity);
    }

	public int getOrderId() {
		return orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public int getTotal() {
		return total;
	}
}
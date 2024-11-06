package model;

public class Order {
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private int total;

    public Order(int orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.total = product.getPrice() * quantity;
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
	
    public String toString() {
		return "- order: " + getOrderId() 
		+ ", customer: " + getCustomer().getId() 
		+ ", product: " + getProduct().getName() 
		+ ", qt: " + getQuantity()
		+ ", total: " + getTotal() + "$\n";
    }
}
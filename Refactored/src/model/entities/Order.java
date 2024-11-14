package model.entities;

import model.interfaces.ICustomer;
import model.interfaces.IOrder;
import model.interfaces.IProduct;

public class Order implements IOrder {
    private int orderId;
    private ICustomer customer;
    private IProduct product;
    private int quantity;
    private int total;

    public Order(int orderId, ICustomer customer, IProduct product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.total = product.getPrice() * quantity;
    }

	@Override
	public int getOrderId() {
		return orderId;
	}

	@Override
	public ICustomer getCustomer() {
		return customer;
	}

	@Override
	public IProduct getProduct() {
		return product;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public int getTotal() {
		return total;
	}
	
    @Override
	public String toString() {
		return "- order: " + getOrderId() 
		+ ", customer: " + getCustomer().getId() 
		+ ", product: " + getProduct().getName() 
		+ ", qt: " + getQuantity()
		+ ", total: " + getTotal() + "$\n";
    }
}
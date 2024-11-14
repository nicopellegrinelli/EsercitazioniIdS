package model.interfaces;

public interface IOrder {

	int getOrderId();

	ICustomer getCustomer();

	IProduct getProduct();

	int getQuantity();

	int getTotal();

	String toString();

}
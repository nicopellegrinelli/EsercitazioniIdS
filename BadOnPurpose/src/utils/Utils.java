package utils;

import Services.OrderService;
import model.Order;
import model.Product;

public class Utils {
    public static String getOrdersInfo(OrderService os) {
    	String result = "Orders:\n";
		for (Order o : os.getOrders()) {
			result += "- order: " + o.getOrderId() 
					+ ", customer: " + o.getCustomer().getId() 
					+ ", product: " + o.getProduct().getName() 
					+ ", qt: " + o.getQuantity()
					+ ", total: " + o.getTotal() + "$\n";
		}
		return result;
    }

	public static int getTotal(Product product, int quantity) {
		return product.getPrice() * quantity;
	}
}
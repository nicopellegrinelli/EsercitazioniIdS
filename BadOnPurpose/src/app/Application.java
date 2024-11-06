package app;

import Services.CustomerService;
import Services.OrderService;
import Services.ProductService;

import utils.Utils;

public class Application {
    public static void main(String args[]) {
    	OrderService orderService = OrderService.getInstance();
        ProductService productService = ProductService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
        
        productService.addProduct("Pizza", 7);
        productService.addProduct("Pasta", 5);
        
        customerService.addCustomer("customer1");
        

        orderService.addOrder(1, "customer1", "Pizza", 3);
        orderService.addOrder(2, "customer1", "Pasta", 1);
        
        System.out.println(Utils.getOrdersInfo(orderService));
    }
}
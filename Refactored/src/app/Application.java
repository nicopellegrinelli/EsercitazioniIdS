package app;

import model.entities.PremiumCustomer;
import services.CustomerService;
import services.OrderService;
import services.ProductService;

public class Application {
    public static void main(String[] args) {
    	OrderService orderService = OrderService.getInstance();
        ProductService productService = ProductService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
        
        productService.addProduct("Pizza", 7);
        productService.addProduct("Pasta", 5);
        
        String c1 = "customer1";
        customerService.addCustomer(c1, "31/12/1999", "Mario Rossi");
        customerService.addPremiumCustomer("customer2", "01/01/2000", "Maria Bianchi", PremiumCustomer.Level.GOLD);
        System.out.println(customerService.getCustomer("customer1").toString());
        System.out.println(customerService.getCustomer("customer2").toString());

        orderService.addOrder(1, c1, "Pizza", 3);
        orderService.addOrder(2, c1, "Pasta", 1);
        
        System.out.println(orderService.toString());
    }
}
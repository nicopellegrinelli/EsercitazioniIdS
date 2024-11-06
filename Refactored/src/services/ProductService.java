package services;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductService {
	private static ProductService instance;
	
	public static ProductService getInstance() {
		if (instance == null)
			instance = new ProductService();
		return instance;
	}
	
	private ProductService() {
		super();
	}
	
	private List<Product> products = new ArrayList<>();

	public void addProduct(String name, int price) {
		products.add(new Product(name, price));
	}

	public Product getProduct(String productName) {
		for (Product p : products) {
			if (p.getName().equals(productName))
				return p;
		}
		return null;
	}
}
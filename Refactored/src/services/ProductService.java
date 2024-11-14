package services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.interfaces.IProduct;

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
	
	private List<IProduct> products = new ArrayList<>();

	public void addProduct(String name, int price) {
		products.add(new Product(name, price));
	}

	public IProduct getProduct(String productName) {
		for (IProduct p : products) {
			if (p.getName().equals(productName))
				return p;
		}
		return null;
	}
}
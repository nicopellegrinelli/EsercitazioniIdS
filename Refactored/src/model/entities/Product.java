package model.entities;

import model.interfaces.IProduct;

public class Product implements IProduct {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
	public String getName() {
        return name;
    }
    
    @Override
	public int getPrice() {
        return price;
    }
}
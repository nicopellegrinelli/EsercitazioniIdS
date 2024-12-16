package strategy;

import javax.management.RuntimeErrorException;

public class PriceCalculator {
	private DiscountStrategy strategy;
	
	public void setStrategy(DiscountStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double computeNewPrice(double price) {
		if (strategy== null)
			throw new RuntimeErrorException(null,
					"Nessuna strategia settata");
		return strategy.applyDiscount(price);
	}

}

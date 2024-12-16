package strategy;

public class PercentageDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double price) {
		return price-price*0.1;
	}

}

package strategy;

public class FixedAmountDiscount implements DiscountStrategy {
	private double discount;
	
	public FixedAmountDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public double applyDiscount(double price) {
		return price > discount? price-discount : 0;
	}

}

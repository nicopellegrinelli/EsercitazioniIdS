package strategy;

public class Main {

	public static void main(String[] args) {
		PriceCalculator pc = new PriceCalculator();
		int price = 100;
		pc.setStrategy(new NoDiscount());
		System.out.println(pc.computeNewPrice(price));
		pc.setStrategy(new PercentageDiscount());
		System.out.println(pc.computeNewPrice(price));
		pc.setStrategy(new FixedAmountDiscount(80));
		System.out.println(pc.computeNewPrice(price));
	}

}

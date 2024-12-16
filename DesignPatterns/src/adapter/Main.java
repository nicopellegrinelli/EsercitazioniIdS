package adapter;

public class Main {

	public static void main(String[] args) {
		OldPaymentProcessor oldProcessor = new OldPaymentProcessor();
		ModernPaymentProcessor processor = new PaymentAdapter(oldProcessor);
		processor.processEuroPayment(23.50);
	}

}

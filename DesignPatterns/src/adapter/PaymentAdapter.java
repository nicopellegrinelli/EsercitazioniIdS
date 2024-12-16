package adapter;

public class PaymentAdapter implements ModernPaymentProcessor {
	private OldPaymentProcessor op;
	
	public PaymentAdapter(OldPaymentProcessor op) {
		this.op = op;
	}

	@Override
	public void processEuroPayment(double amountInEuros) {
		int amountInCents = (int)(amountInEuros*100);
		String result = op.processPayment(amountInCents);
		System.out.println(result);
	}

}

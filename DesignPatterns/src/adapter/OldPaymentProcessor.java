package adapter;

public class OldPaymentProcessor {
	
	public String processPayment(int amountInCents) {
		return "Processing payment: " + amountInCents + " cents";
	}
	
}

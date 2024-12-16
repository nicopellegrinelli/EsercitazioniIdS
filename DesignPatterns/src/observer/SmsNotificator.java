package observer;

public class SmsNotificator implements Observer {

	@Override
	public void update(int balance) {
		System.out.println("SMS send. New balance: " + balance + " euro");
	}
}

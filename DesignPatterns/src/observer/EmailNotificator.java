package observer;

public class EmailNotificator implements Observer {

	@Override
	public void update(int balance) {
		System.out.println("Email send. New balance: " + balance + " euro");
	}

}

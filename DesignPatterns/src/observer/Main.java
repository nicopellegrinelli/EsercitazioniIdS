package observer;

public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		SmsNotificator sn = new SmsNotificator();
		EmailNotificator en = new EmailNotificator();
		ba.addObserver(en);
		ba.addObserver(sn);
		ba.changeBalance(-10);
		ba.clear();
		ba.removeObserver(sn);
		ba.changeBalance(100);
	}

}

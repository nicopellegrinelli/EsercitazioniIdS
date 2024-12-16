package observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private int balance;
	private List<Observer> observers;
	
	public BankAccount() {
		balance = 100;
		observers = new ArrayList<>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer o : observers)
			o.update(balance);
	}
	
	public void changeBalance(int delta) {
		this.balance += delta;
		notifyObservers();
	}
	
	public void clear() {
		this.balance = 0;
		notifyObservers();
	}

}

package singleton;

public class Main {

	public static void main(String[] args) {
		ConfigurationManager cm = ConfigurationManager.getInstance();
		cm.addNew("A", "B");
		cm.update("C", "E");
		addCD();
		cm.update("C", "E");
		cm.print();
	}

	private static void addCD() {
		ConfigurationManager.getInstance().addNew("C", "D");
	}

}

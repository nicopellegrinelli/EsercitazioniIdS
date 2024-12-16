package factory;

public class WordDocument extends Document {

	public WordDocument(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println("Opening " + name + ".doc");
	}

	@Override
	public void close() {
		System.out.println("Closing " + name + ".doc");
	}

}

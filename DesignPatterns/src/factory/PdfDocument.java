package factory;

public class PdfDocument extends Document {

	public PdfDocument(String name) {
		super(name);
	}

	@Override
	public void open() {
		System.out.println("Opening " + name + ".pdf");
	}

	@Override
	public void close() {
		System.out.println("Closing " + name + ".pdf");
	}

}

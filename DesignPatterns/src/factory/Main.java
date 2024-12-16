package factory;

public class Main {

	public static void main(String[] args) {
		DocumentFactory factory = new WordDocumentFactory();
		factory.workWithDoc("temp1");
		factory = new PdfDocumentFactory();
		factory.workWithDoc("temp2");
		
		Document d = factory.createDocument("temp3");
		d.open();
		d.close();
	}

}

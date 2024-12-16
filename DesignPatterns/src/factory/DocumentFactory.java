package factory;

public abstract class DocumentFactory {
	
	public void workWithDoc(String name) {
		Document d = createDocument(name);
		d.open();
		// WORK WITH THE DOC
		d.close();
	}
	
	public abstract Document createDocument(String name);

}

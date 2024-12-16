package factory;

public abstract class Document {
	protected String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public abstract void open();
	
	public abstract void close();
}

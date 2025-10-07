package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Application {
	private List<Document> docs;
	
	public Application() {
		this.docs = new ArrayList<Document>();
	}
	
	abstract public Document createDocument();
	public void openDocument() {
		Document doc = this.createDocument();
		docs.add(doc);
		doc.open();
	}
}

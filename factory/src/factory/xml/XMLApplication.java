package factory.xml;

import factory.Application;
import factory.Document;

public class XMLApplication extends Application {

	@Override
	public Document createDocument() {
		return new XMLDocument();
	}
}

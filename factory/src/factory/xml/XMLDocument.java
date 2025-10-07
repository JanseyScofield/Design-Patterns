package factory.xml;

import factory.Document;

public class XMLDocument implements Document {

	@Override
	public void open() {
		System.out.println("Abrindo um documento XML.");
	}

	@Override
	public void close() {
		System.out.println("Fechando um documento XML.");
	}

}

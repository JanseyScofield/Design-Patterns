package factory;

import factory.xml.XMLApplication;

public class App {
	public static void main(String[] args) {
		App.run(new XMLApplication());
	}
	
	public static void run(Application app) {
		app.createDocument();
	}
}

package abstractfactory;

public class Client {
	private WidgetFactory factory;
	
	public Client(WidgetFactory factory) {
		this.factory = factory;
	}
	
	public void executeActions() {
		Window window = factory.createWindow();
		Button button = factory.createButton();
		window.open();
		button.click();
	}
}

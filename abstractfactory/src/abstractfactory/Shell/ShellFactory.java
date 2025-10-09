package abstractfactory.Shell;

import abstractfactory.Button;
import abstractfactory.WidgetFactory;
import abstractfactory.Window;

public class ShellFactory implements WidgetFactory{

	@Override
	public Window createWindow() {
		return new ShellWindow();
	}

	@Override
	public Button createButton() {
		return new ShellButton();
	}
	
}

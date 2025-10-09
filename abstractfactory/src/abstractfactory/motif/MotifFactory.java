package abstractfactory.motif;

import abstractfactory.Button;
import abstractfactory.WidgetFactory;
import abstractfactory.Window;

public class MotifFactory implements WidgetFactory {

	@Override
	public Window createWindow() {
		return new MotifWindow();
	}

	@Override
	public Button createButton() {
		return new MotifButton();
	}

}

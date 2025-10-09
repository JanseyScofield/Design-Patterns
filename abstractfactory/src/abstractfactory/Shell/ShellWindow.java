package abstractfactory.Shell;

import abstractfactory.Window;

public class ShellWindow implements Window {

	@Override
	public void open() {
		System.out.println("Open a Shell window");
	}
}

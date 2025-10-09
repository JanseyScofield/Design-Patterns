package abstractfactory.Shell;

import abstractfactory.Button;

public class ShellButton implements Button {

	@Override
	public void click() {
		System.out.println("Click Shell button");
	}
}

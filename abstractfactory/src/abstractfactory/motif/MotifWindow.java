package abstractfactory.motif;

import abstractfactory.Window;

public class MotifWindow implements Window {

	@Override
	public void open() {
		System.out.println("Open a Motif window.");
	}
}

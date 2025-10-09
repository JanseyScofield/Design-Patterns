package abstractfactory.motif;

import abstractfactory.Button;

public class MotifButton implements Button {

	@Override
	public void click() {
		System.out.println("Click Motif button");
	}

}

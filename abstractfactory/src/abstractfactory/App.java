package abstractfactory;

import abstractfactory.Shell.ShellFactory;
import abstractfactory.motif.MotifFactory;

public class App {
	public static void main(String[] args) {
		new Client(new MotifFactory()).executeActions();
		new Client(new ShellFactory()).executeActions();
	}
	
}

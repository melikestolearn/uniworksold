package console;

import main.Base;

public class Test extends ConsoleCommand {

	public Test(Base b) {
		super(b);
	}
	
	public void run() {
		 System.out.println("TEST SUCCESFULL");
	}
	
}
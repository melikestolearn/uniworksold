package main;

import connection.Connector;

/** This is the base of the program.
 * Every part build up here.
 */
public class Base {
	private Connector connector;
	
	public Base() {
		connector = new Connector(this, System.in);
	}
	
	public void estCon() throws Exception {
		String in1;
		
		boolean gotInput = false;
		while(!gotInput) {
			in1 = connector.readLineFromKeyboard();
			String[] tokens = in1.split("\\s+");
			String com = tokens[0].toLowerCase();
			
			if(com.equals("connect")) {
				if(tokens.length<2)
					throw new Exception("Illegal command.");
				
				connector.connect(tokens[1]);
				gotInput = true;
			}
			else if(com.equals("host")) {
				connector.host();
				gotInput = true;
			}
		}
		
	}
}

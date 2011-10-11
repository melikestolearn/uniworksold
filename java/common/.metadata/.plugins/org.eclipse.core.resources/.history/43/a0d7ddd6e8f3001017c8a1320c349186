package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

import connection.Connector;

public class Base {
	private Connector connector;
	
	public Base() {
		connector = new Connector();
	}
	
	private void estCon() throws UnknownHostException, IOException {
		String in1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		boolean choosed = false;
		while(!choosed) {
			String[] tokens = in1.split("\\s+");
			if((tokens[0].toLowerCase()).equals("connect")) {
				connector.connect(tokens[1]);
				choosed = true;
			}
			else if(tokens[0].toLowerCase().equals("host")) {
				connector.host();
				choosed = true;
			}
		}
		
	}
}

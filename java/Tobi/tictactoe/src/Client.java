import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class Client {
	/*
	 * client wich connects to Server
	 */
	public Client() throws IOException{
		Socket s = new Socket();
		
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		}
}

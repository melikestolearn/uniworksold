package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import main.Base;

public class Connector {

	private final Base base;
	
	private Socket friendSocket;
	
	private final int defaultPort;
	private int realPort;

	private InputStream input;
	private OutputStream output;
	
	private BufferedReader myKeyboardReader;
	
	public Connector(Base b, InputStream myInput) {
		defaultPort = 810;
		myKeyboardReader = new BufferedReader(new InputStreamReader(myInput));
		base = b;
	}
	
	public void host() throws IOException {
		final ServerSocket myServer = new ServerSocket(defaultPort);
		
		friendSocket = myServer.accept();
	}
	
	public void connect(String hostname) throws UnknownHostException, IOException {
		friendSocket = new Socket(hostname, defaultPort);
		
		friendSocket.getOutputStream().write(1);
	}
	public String readLineFromKeyboard() throws IOException {
		return myKeyboardReader.readLine();
	}

}
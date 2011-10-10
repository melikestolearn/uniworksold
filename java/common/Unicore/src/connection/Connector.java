package connection;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {

	
	private Socket friendSocket;
	
	private final int defaultPort;
	private int realPort;

	private InputStream input;
	private OutputStream output;
	
	public Connector() {
		defaultPort = 810;
	}
	
	public void host() throws IOException {
		final ServerSocket myServer = new ServerSocket(defaultPort);
		
		friendSocket = myServer.accept();
	}
	
	public void connect(String hostname) throws UnknownHostException, IOException {
		friendSocket = new Socket(hostname, defaultPort);
		
		friendSocket.getOutputStream().write(1);
	}

}

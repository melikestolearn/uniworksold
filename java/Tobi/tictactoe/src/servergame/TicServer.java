package servergame;
import java.io.IOException;
import java.net.*;

/*
 * This class holds an Server for the TicTacToe game
 * The Server is using port 2000 as default
 */
public class TicServer {
	private ServerSocket ss;
	TicServer() throws IOException {
		ss = new ServerSocket(2000);
		Socket s = ss.accept();
	
	}
}


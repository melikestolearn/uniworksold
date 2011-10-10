import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JFileChooser;



/*
 * liest von stdin ein und schreibt in ein file
 */
public class StdinToFile {

	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		final JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(new Frame());
		final File fileImg = chooser.getSelectedFile();
		String url = fileImg.getCanonicalPath();
		
		File outputFile = new File (url);
		PrintWriter pw = new PrintWriter(outputFile);

		String str = br.readLine();
		while(str!=null){
			pw.println(str);
			str = br.readLine();
		}
		is.close();
		pw.close();
	}
}

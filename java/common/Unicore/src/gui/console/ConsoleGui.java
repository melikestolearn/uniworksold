package gui.console;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

import main.Base;

/**
 *
 */
public class ConsoleGui extends JFrame {
    
	private int lastCommandPosition = 0;
	
	private final Base base;
	
	private JTextArea console;
    private JScrollPane jScrollPane1;
    
    /** Creates new form Console */
    public ConsoleGui(Base b) {
        initComponents();
        base = b;
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        console = new JTextArea();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Console");
        setResizable(false);

        jScrollPane1.setName("jScrollPane1");
        
        console.setName("console");
        jScrollPane1.setViewportView(console);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
        
        console.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
					consoleKeyTyped(evt);
            }
        });
    }
	private void consoleKeyTyped(KeyEvent evt){
    	if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
    		String lastLine = null;
			try {
				lastLine = console.getText(lastCommandPosition, console.getDocument().getLength()-lastCommandPosition);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		lastCommandPosition = console.getCaretPosition()+1;
    		System.out.println(lastLine);	//@REMOVE
    	}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConsoleGui(new Base()).setVisible(true);
            }
        });
    }
}

package behavioral.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CommandFrame extends JFrame {

	 private JButton buton;
	    private AbstractAction komut;
	 
	    public CommandFrame(AbstractAction komut) {
	        this.komut =komut;
	        setTitle("Command Pattern");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        initButton();
	    }
	 
	    private void initButton() {
	        buton = new JButton("Calistir");
	        buton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                komut.actionPerformed(e);
	            }
	        });
	        getContentPane().add(buton);
	    }
	
	public static void main(String[] args) {
		
		CommandFrame frame = new CommandFrame(new MesajGosterAction());
        frame.setVisible(true);
	}

}

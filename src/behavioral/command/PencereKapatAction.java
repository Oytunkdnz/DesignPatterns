package behavioral.command;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class PencereKapatAction extends AbstractAction {
	private JFrame frame;    
    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }
     
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}

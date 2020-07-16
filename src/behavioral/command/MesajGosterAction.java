package behavioral.command;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class MesajGosterAction extends AbstractAction {
	public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Merhaba");
    }
}

package behavioral.command;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.AbstractAction;

public class KayitEkleAction extends AbstractAction {
	private Connection con;
    private Statement stmt;
 
    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:Bus", "", "");
            stmt = con.createStatement();
            stmt.executeUpdate("Insert Into Tablo (Deger) VALUES ('Calisti')");
 
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}

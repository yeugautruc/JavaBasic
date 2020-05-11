package de.ostfalia.lounge;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
 
public class testMenu
{
     public static void main(String[] args)
    {
    	JDialog meinJDialog = new JDialog(); // create new dialog
        meinJDialog.setTitle("JMenuBar für unser Java Tutorial Beispiel."); //set titel
        meinJDialog.setSize(450,300); // set size 
        Border bo = new LineBorder(Color.yellow); // create border, set yellow border
        JMenuBar bar = new JMenuBar(); // create menu bar
        bar.setBorder(bo); // set Border
        JMenu neu = new JMenu("New");// create menu object 
        JMenu edit = new JMenu("Edit");// create menu object
        JMenu file = new JMenu("File");// create menu object 
        JMenu help = new JMenu("Help");// create menu object 
        bar.add(file);// add Menu object to menubar
        bar.add(neu);// add Menu object to menubar
        bar.add(edit);// add Menu object to menubar
        bar.add(help);// add Menu object to menubar
        meinJDialog.setJMenuBar(bar);// put bar into dialog
        meinJDialog.setVisible(true);// make dialog visible
    }
}
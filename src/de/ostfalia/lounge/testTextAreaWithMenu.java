package de.ostfalia.lounge;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
 
public class testTextAreaWithMenu {
    public static void main(String[] args) {
    	// setup frame
        JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("Example");
        meinJFrame.setSize(500, 500);
        JPanel panel = new JPanel(); // create new panel
        // setup menu
        Border bo = new LineBorder(Color.yellow); // create border, set yellow border
        JMenuBar bar = new JMenuBar(); // create menu bar
        bar.setBorder(bo); // set Border
        JMenu jedit = new JMenu("Edit");// create menu object
        JMenu jfile = new JMenu("File");// create menu object 
        JMenu jhelp = new JMenu("Help");// create menu object 
        bar.add(jfile);// add Menu object to menu bar
        bar.add(jedit);// add Menu object to menu bar
        bar.add(jhelp);// add Menu object to menu bar
        // setup menu item for File menu
        JMenuItem jnew = new JMenuItem("New");
        JMenuItem jopen = new JMenuItem("Open");
        JMenuItem jsave = new JMenuItem("Save");
        JMenuItem jquit = new JMenuItem("Quit");
        jfile.add(jnew);
        jfile.add(jopen);
        jfile.add(jsave);
        jfile.add(jquit);
        // setup menu item for Edit menu
        JMenuItem jcopy = new JMenuItem("Copy");
        JMenuItem jpaste = new JMenuItem("Paste");
        JMenuItem jcut = new JMenuItem("Cut");
        jedit.add(jcopy); 
        jedit.add(jpaste); 
        jedit.add(jcut);
        // setup menu item for help menu
        JMenuItem jabout = new JMenuItem("About us");
        jhelp.add(jabout);
        meinJFrame.setJMenuBar(bar);// put menu bar into frame
        meinJFrame.setVisible(true);// make frame visible
        // setup text area
        JTextArea textfeld = new JTextArea(29, 44);//create 44 column and 29 row
        textfeld.setText("add text here");//Create initiate text
        textfeld.setLineWrap(true);// set warp true make sure text fit the width
        textfeld.setWrapStyleWord(true);//if the hold word not fit the width, it will come to new line
        // set up scroll panel
        JScrollPane scrollpane = new JScrollPane(textfeld);//Scroll to show        
        panel.add(scrollpane);  //add scroll panel to panel
 
        meinJFrame.add(panel); //add panel to frame
        meinJFrame.setVisible(true);
               
 
    }
}

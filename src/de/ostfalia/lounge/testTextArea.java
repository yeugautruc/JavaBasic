package de.ostfalia.lounge;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


 
public class testTextArea {
    public static void main(String[] args) {
    	JFrame meinJFrame = new JFrame();
        meinJFrame.setTitle("Example");
        meinJFrame.setSize(500, 500);
        JPanel panel = new JPanel();
         
        JTextArea textfeld = new JTextArea(29, 44);//create 44 column and 29 row
        textfeld.setText("add text here");//Create initiate text
        textfeld.setLineWrap(true);// set warp true make sure text fit the width
        textfeld.setWrapStyleWord(true);//if the hold word not fit the width, it will come to new line
 
        JScrollPane scrollpane = new JScrollPane(textfeld);//Scroll to show        
        panel.add(scrollpane);  //add scrollpane to panel
 
        meinJFrame.add(panel); //add panel to frame
        meinJFrame.setVisible(true);
 
    }
}

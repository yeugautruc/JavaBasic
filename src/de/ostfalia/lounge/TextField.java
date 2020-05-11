package de.ostfalia.lounge;

import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatter;

class MyFormatter extends DefaultFormatter {
public MyFormatter() {
    super();
  }
  public String valueToString(Object arg0) throws ParseException {
    return super.valueToString(arg0);
  }
  public Object stringToValue(String arg0) throws ParseException {
    try {
      int value = Integer.parseInt(arg0);
      if (value >= 1 && value <= 10) {
        return "" + value;
      } else {
        return "Invalid";
      }
    } catch (Exception e) {
      return "Invalid";
    }
  }
}
public class TextField extends JFrame {
public TextField() {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Number :");
    JFormattedTextField tf = new JFormattedTextField(new MyFormatter());
    tf.setColumns(10);
    panel.add(label);
    panel.add(tf);
    getContentPane().add(panel, BorderLayout.SOUTH);
    pack();
  }

  public static void main(String[] args) {
    TextField mfe = new TextField();
    mfe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mfe.setVisible(true);
  }
}     
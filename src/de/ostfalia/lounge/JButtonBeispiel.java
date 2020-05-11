package de.ostfalia.lounge;
import javax.swing.*;
 
public class JButtonBeispiel
{
    public static void main(String[] args)
    {
        JFrame myJFrame = new JFrame();
        myJFrame.setTitle("JButton Beispiel");
        myJFrame.setSize(1000,1000);
        JPanel panel = new JPanel();
        // Create JButton with "Change" titel
        JButton buttonsave = new JButton("Save");
        JButton buttonload = new JButton("Load");
        JButton buttonexit = new JButton("Exit");
        //add Spinner
        JSpinner spinner = new JSpinner();
        JSpinner spinner1 = new JSpinner();
        JSpinner spinner2 = new JSpinner();
        JSpinner spinner3 = new JSpinner();
        JSpinner spinner4 = new JSpinner();
        JSpinner spinner5 = new JSpinner();
        //add change listener to spinner
//        spinner1.addChangeListener(listener);
        // JButton add to panel
        panel.add(buttonsave);
        panel.add(buttonload);
        panel.add(buttonexit);
        panel.add(spinner);
        panel.add(spinner1);
        panel.add(spinner2);
        panel.add(spinner3);
        panel.add(spinner4);
        panel.add(spinner5);
        myJFrame.add(panel);
        
        // Windowsize will resize to compatible with Content
//        myJFrame.pack();
 
        myJFrame.setVisible(true);
    }
}
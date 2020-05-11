package de.ostfalia.lounge;
import java.awt.event.*;  
import javax.swing.*;

public class Button {
Button(){    
JFrame f=new JFrame("Button Example");
JButton b1=new JButton(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\kreuzung200.jpeg"));    
b1.setBounds(100,100,200,200);  
b1.setPressedIcon(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\leer.png"));
JButton b11=new JButton(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\leer.png"));    
b11.setBounds(100,100,200,200);  
b11.setPressedIcon(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\kreuzung200.jpeg"));
JButton b2=new JButton(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\kreuzung200.jpeg"));  
b2.setBounds(300,100,200,200);  
b2.setPressedIcon(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\leer.png"));
JButton b21=new JButton(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\leer.png"));    
b21.setBounds(300,100,200,200);  
b21.setPressedIcon(new ImageIcon("D:\\InfoSoSe2019\\EKDI\\kreuzung200.jpeg"));
f.add(b1);f.add(b11);
f.add(b2);f.add(b21);
b1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
	b1.setVisible(false);
	b11.setVisible(true);
        }  
    }); 
b11.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
	b11.setVisible(false);
	b1.setVisible(true);
        }  
    }); 
b2.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
	b2.setVisible(false);
	b21.setVisible(true);
        }  
    }); 
b21.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
	b21.setVisible(false);
	b2.setVisible(true);
        }  
    });

f.setSize(1500,800);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         



	public static void main(String[] args) {
		new Button();
	}
}
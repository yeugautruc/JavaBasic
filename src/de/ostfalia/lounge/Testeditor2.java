package de.ostfalia.lounge;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class Testeditor2 extends JFrame implements ActionListener, WindowListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea jta = new JTextArea();
	File fnameContainer;

	public Testeditor2() {
		Font fnt = new Font("Arial", Font.PLAIN, 15);
		Container con = getContentPane();

		JMenuBar jmb = new JMenuBar();
		jmb.setFont(new Font("sans-serif", Font.PLAIN, 22));
		JMenu jmfile = new JMenu("File");
		JMenu jmhelp = new JMenu("Help");

		con.setLayout(new BorderLayout());
		JScrollPane sbrText = new JScrollPane(jta);
		sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sbrText.setVisible(true);

		jta.setFont(fnt);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);

		con.add(sbrText);
		con.add("Center", new AreaIntersecting());

		createMenuItem(jmfile, "LOAD");
		createMenuItem(jmfile, "SAVE");
		jmfile.addSeparator();
		createMenuItem(jmfile, "Exit");
		createMenuItem(jmhelp, "Über Uns");
		jmb.add(jmfile);
		jmb.add(jmhelp);

		setJMenuBar(jmb);
		addWindowListener(this);
		setSize(800, 800);
		setTitle("Kreuzung Programm");

		setVisible(true);

	}

	public void createMenuItem(JMenu jm, String txt) {
		JMenuItem jmi = new JMenuItem(txt);
		jmi.addActionListener(this);
		jm.add(jmi);
	}

	public void actionPerformed(ActionEvent e) {
		JFileChooser jfc = new JFileChooser();

		if (e.getActionCommand().equals("LOAD")) {
			int ret = jfc.showDialog(null, "LOAD");
			if (ret == JFileChooser.APPROVE_OPTION) {
				try {
					File fyl = jfc.getSelectedFile();
					LoadFile(fyl.getAbsolutePath());
					this.setTitle(fyl.getName() + " - Kreuzung");
					fnameContainer = fyl;
				} catch (IOException ers) {
				}
			}
		} else if (e.getActionCommand().equals("SAVE")) {
			// save
			if (fnameContainer != null) {
				jfc.setCurrentDirectory(fnameContainer);
				jfc.setSelectedFile(fnameContainer);
			}

			int ret = jfc.showSaveDialog(null);

			if (ret == JFileChooser.APPROVE_OPTION) {
				try {

					File fyl = jfc.getSelectedFile();
					SaveFile(fyl.getAbsolutePath());
					this.setTitle(fyl.getName() + " - Kreuzung");
					fnameContainer = fyl;

				} catch (Exception ers2) {
				}
			}

		} else if (e.getActionCommand().equals("Über Uns")) {
			// about
			JOptionPane.showMessageDialog(this, "Kreuzung Programm von Gruppe 3", "Gruppe3",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else if (e.getActionCommand().equals("Exit")) {
			// exit
			Exiting();
		}
	}

	public void LoadFile(String fname) throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(new FileInputStream(fname)));
		String l;
		jta.setText("");

		setCursor(new Cursor(Cursor.WAIT_CURSOR));

		while ((l = d.readLine()) != null) {
			jta.setText(jta.getText() + l + "\r\n");
		}

		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		d.close();
	}

	public void SaveFile(String fname) throws IOException {
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		DataOutputStream o = new DataOutputStream(new FileOutputStream(fname));
		o.writeBytes(jta.getText());
		o.close();
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
		Exiting();
	}

	public void windowOpened(WindowEvent e) {
	}

	public void Exiting() {
		System.exit(0);
	}

	public class AreaIntersecting extends JPanel {
		/**
		* 
		*/
		private static final long serialVersionUID = 1L;
		DrawingCanvas canvas;

		public AreaIntersecting() {
			canvas = new DrawingCanvas();
			add(canvas);

			canvas.area1 = new Area(canvas.gp);
			canvas.area1.intersect(canvas.area2);
			canvas.repaint();
		}

		class DrawingCanvas extends Canvas {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			GeneralPath gp;
			Ellipse2D ellipse;
			Area area1, area2;

			public DrawingCanvas() {
				setBackground(Color.white);
				setSize(800, 800);
				int w = getWidth();
				int h = getHeight();

				gp = new GeneralPath();
				gp.moveTo(w / 8, h / 2);
				gp.lineTo(w / 2, h / 4);
				gp.lineTo(7 * w / 8, h / 2);
				gp.lineTo(w / 2, 3 * h / 4);
				gp.closePath();
				area1 = new Area(gp);

				ellipse = new Ellipse2D.Double(w / 4, h / 4, w / 2, h / 2);
				area2 = new Area(ellipse);
			}

			public void paint(Graphics g) {
				Graphics2D g2D = (Graphics2D) g;
				g2D.setStroke(new BasicStroke(2.0f));

				g2D.draw(area1);
				g2D.draw(area2);
			}

		}
	}

	public static void main(String[] args) {
		new Testeditor2();
	}
}
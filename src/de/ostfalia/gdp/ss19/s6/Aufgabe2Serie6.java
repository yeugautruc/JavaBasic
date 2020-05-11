package de.ostfalia.gdp.ss19.s6;

import java.util.Scanner;
//import java.util.Arrays;

public class Aufgabe2Serie6 {
	public static char[][] output = init(51, 21);;
	public static int x_size = 0;
	public static int y_size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\.");
		System.out.println("Bitte String eingeben: ");
		java.lang.String input = s.next();
		s.close();
		read(input);
		System.out.println("Ergebnis: \n");
		System.out.println(asString());

	}

	public static char get(int y, int x) {
		char c = ' ';
		c = output[x][y];
		return c;
	}

	public static char[][] init(int y_size, int x_size) {
		output = new char[x_size][y_size];
		for (int i = 0; i < x_size; i++) {
			for (int j = 0; j < y_size; j++) {
				output[i][j] = ' ';
			}
		}
		return output;
	}

	public static void set(int y, int x, char value) {
		output[x][y] = value;
	}

	public static void read(java.lang.String input) {
		String tempstring = "";
		java.lang.Integer i = 0;
		while (i < input.length() - 8) {
			while (input.charAt(i) != ',' && input.charAt(i) != '.') {
				if (input.charAt(i) != ',' && input.charAt(i) != '.') {
					tempstring = tempstring + input.charAt(i++);
				}
			}
			char value = ' ';
			boolean findx = false;
			int findy = 0;
			String xstring = "";
			String ystring = "";
			for (int j = 0; j < tempstring.length(); j++) {
				if (tempstring.charAt(j) == ':') {
					findx = true;
					findy++;
				}
				if (tempstring.charAt(j) != ':') {
					if (findx == false && findy == 0) {
						xstring = xstring + tempstring.charAt(j);
					} else if (findx == true && findy == 1) {
						ystring = ystring + tempstring.charAt(j);
					} else if (findy == 2) {
						value = tempstring.charAt(j);
					}
				}
			}

			int x = Integer.valueOf(xstring);
			int y = Integer.valueOf(ystring);
			if (x > x_size) {
				int temp = x;
				x_size = temp;
			}
			if (y > y_size) {
				int temp = y;
				y_size = temp;
			}
			set(y, x, value);
			tempstring = "";
			i++;
		}
		System.out.println("X Size, Y Size: " + (x_size+1) + ", " + (y_size+1));
		System.out.println("End Read");
	}

	public static java.lang.String asString() {
		String c = "";
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[0].length; j++) {
				c = c + get(j, i);
			}
			c = c + "\n";
		}
		return c;
	}
}

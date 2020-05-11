package de.ostfalia.gdp.ss19.s4;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;

public class Aufgabe44Serie4Kurz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(in);
		System.out.print("Eingabe file name = ");
		String fileName = s.next();
		boolean word = false;
		int n = s.nextInt(); 
		int line = 0;
		int count = 0;
		char c = 0;
		String row = "";
		// file read
		FileReader reader = new FileReader(fileName);
		// buffer reader
		BufferedReader inBuffer = new BufferedReader(reader);
		StringBuilder builder = new StringBuilder();

		while ((row = inBuffer.readLine()) != null) {
			builder.append("Line " + ++line + " = ");
			for (int i = 0; i != row.length(); ++i) {
				c = row.charAt(i);
				if (c == ' ') {
					word = false;
				} else if (!word) {
					++count;
					word = true;
				}
				builder.append(word && (count % n == 0) ? '#' : c);
			}
			word = false;
			builder.append('\n');
		}
		System.out.println(builder.toString());
		inBuffer.close();
		s.close();
	}
}

package de.ostfalia.gdp.ss19.s4;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;

public class Aufgabe44Serie4UsingClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(in);
		System.out.print("Eingabe file name = ");
		String fileName = s.next();
		String row = "";

		int n = s.nextInt();
		// file read
		FileReader reader = new FileReader(fileName);
		// buffer reader
		BufferedReader inBuffer = new BufferedReader(reader);
		StringBuilder builder = new StringBuilder();
		while ((row = inBuffer.readLine()) != null) {
			builder.append(row);
			builder.append("\n");
		}
		System.out.println("Read from file : \n" + builder.toString());
		printText(wurm(builder.toString(), n));
		inBuffer.close();
		s.close();
	}

	public static String wurm(String text, int n) {
		char c = 0;
		boolean word = false;
		int count = 0;
		String newtext = "";
		for (int i = 0; i < text.length(); ++i) {
			c = text.charAt(i);
			if (c == 32|| c == 10) {
				word = false;
			} else if (!word) {
				word = true;
				++count;
			}
			newtext = newtext + (word && (count % n == 0) ? '#' : c);
		}
		return newtext;
	}

	public static void printText(String newtext) {
		// Print out the new text
		int k = 1;
		System.out.print("Line " + k + " : ");
		for (int i = 0; i < newtext.length(); i++) {
			if (newtext.charAt(i) != 10) {
				System.out.print(newtext.charAt(i));
			} else {
				System.out.println();
				System.out.print("Line " + (k + 1) + " : ");
				k++;
			}
		}
	}

}

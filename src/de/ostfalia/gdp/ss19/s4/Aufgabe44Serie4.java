package de.ostfalia.gdp.ss19.s4;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.in;

public class Aufgabe44Serie4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(in);
		System.out.print("Eingabe = ");
		String fileName = s.next();
		int n = s.nextInt();
		// file read
		FileReader reader = new FileReader(fileName);
		// bufferreader
		BufferedReader inBuffer = new BufferedReader(reader);
		StringBuilder builder = new StringBuilder();
		String text = "";

//		text = inBuffer.readLine();
//		System.out.println("Line1: " + destroy(text, n));
//		System.out.println("Text1: " + text);
//		text = inBuffer.readLine();
//		System.out.println("Line2: " + destroy(text, n));
//		System.out.println("Text2: " + text);
//		text = inBuffer.readLine();
//		System.out.println("Line3: " + destroy(text, n));
//		System.out.println("Text3: " + text);
//		text = inBuffer.readLine();
//		System.out.println("Line4: " + destroy(text, n));
//		System.out.println("Text4: " + text);
		String line1 = inBuffer.readLine();
		if (line1 == "") {
			line1 = inBuffer.readLine();
		}
		System.out.println("line1:" + line1);
		String line2 = inBuffer.readLine();
		if (line2 == "") {
			line2 = inBuffer.readLine();
		}
		System.out.println("line2:" + line2);
		String line3 = inBuffer.readLine();
		if (line3 == "") {
			line3 = inBuffer.readLine();
		}
		System.out.println("line3:" + line3);
		System.out.println("New Line 1: " + destroy(line1, n));
		System.out.println("New Line 2: " + destroy(line2, n));
		System.out.println("New Line 3: " + destroy(line3, n));

	}

	public static String destroy(String text, int n) {
		int word = 0;
		String newtext = "";
		for (int i = 0; i < text.length()-1; i++) {
			if (text.charAt(i) == 32 | text.charAt(i) == 44 | text.charAt(i) == 46) {
				word++;
			}
			// ascii code : 32 space, 44 ",", 46 "."
			if (word != n) {
				newtext = newtext + text.charAt(i);
			} else {
				char temp = text.charAt(i);
				// filter to add x, after see space, add space then add x
				if (temp == 32 | temp == 44 | temp == 46) {
					newtext = newtext + text.charAt(i);
				}
				newtext = newtext + '#';
				if (text.charAt(i + 2) == 32) {
					// test if next 2 character is space, need to
					// reset 'word' and skip the last char to not print 1 more #
					i++;
					word = -1;
				}
			}
		}
		return newtext;
	}

}

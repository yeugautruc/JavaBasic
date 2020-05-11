package de.ostfalia.gdp.ss19.s5;
import java.util.Objects;
import java.util.Scanner;

public class Aufgabe1Serie5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		s.useDelimiter("\\.");
		System.out.print("Text eingeben: ");
		String text = s.next();
		System.out.print("Endung eingeben: ");
		String endung = s1.next();
		System.out.println("Ausgabe: " + zaehleEndungen(text, endung));
		s.close();
		s1.close();
	}

	public static int zaehleEndungen(String a, String b) {
		int result = 0;
		boolean word= false;
		// ? wieso variable "word" nicht benutzen wird
		String tempendung = "";
		for (int i = 0; i < a.length() - 2; ++i) {
			if (a.charAt(i + 2) == 10 || a.charAt(i + 2) == ' ' || a.charAt(i + 2) == 44 || a.charAt(i + 2) == 46
					|| a.charAt(i + 2) == 33) {
				word = true;
				tempendung = tempendung + a.charAt(i) + a.charAt(i + 1);
			} else {
				word = false;
				tempendung = "";
			}
			
			if (tempendung.equals(b)) {
//			if (tempendung == b ) {
				//?warum "==" geht hier nicht, muss man "Objects.equals()" nutzen.
				// weil mit ==, vergleichen nur die Referenz nicht die Inhaltliche
				result++;
			}

		}
		return result;

	}

}

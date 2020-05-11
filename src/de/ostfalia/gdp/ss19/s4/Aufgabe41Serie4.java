package de.ostfalia.gdp.ss19.s4;

import java.util.Scanner;

public class Aufgabe41Serie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.useDelimiter("\\.|\\?|\\!");
		System.out.print("Eingabe: ");
		String inputraw = s.next();
		String input = "";
		String newinput = "";
		String newinput1 = "";
		String newinput2 = "";
		int occur = 0, occur1 = 0, occur2 = 0, occur3 = 0;
		char most1 = 'a', most2 = 'a', most3 = 'a';
		// change every capitel character to non-capitel
		for (int i = 0; i < inputraw.length(); i++) {
			int intinput = (int) inputraw.charAt(i);
			if (intinput < 91 & intinput > 64) {
				intinput = intinput + 32;
				input = input + (char)intinput;
			} else {
				input = input + inputraw.charAt(i);
			}
		}

//		System.out.println("Text ohne capitel "+input);
		//
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				newinput = newinput + input.charAt(i);
			}
		} 
//		System.out.println("Text ohne leerspace "+newinput);
		// Text ohne whitespace
		for (int i = 0; i < newinput.length(); i++) {
			for (int j = 0; j < newinput.length(); j++) {
				if (newinput.charAt(i) == newinput.charAt(j)) {
					occur++;
				}
			}
			if (occur1 < occur) {
				most1 = newinput.charAt(i);
				occur1 = occur;
			}
			occur = 0;

		}
		//
		for (int i = 0; i < newinput.length(); i++) {
			if (newinput.charAt(i) != most1) {
				newinput1 = newinput1 + newinput.charAt(i);
			} // Text ohne most1
		}
		for (int i = 0; i < newinput1.length(); i++) {
			for (int j = 0; j < newinput1.length(); j++) {
				if (newinput1.charAt(i) == newinput1.charAt(j)) {
					occur++;
				}
			}
			if (occur2 < occur) {
				most2 = newinput1.charAt(i);
				occur2 = occur;
			}
			occur = 0;

		}

//		System.out.println("Text ohne most1 "+newinput1);
		//
		for (int i = 0; i < newinput1.length(); i++) {
			if (newinput1.charAt(i) != most2) {
				newinput2 = newinput2 + newinput1.charAt(i);
			} // Text ohne most2
		}
		for (int i = 0; i < newinput2.length(); i++) {
			for (int j = 0; j < newinput2.length(); j++) {
				if (newinput2.charAt(i) == newinput2.charAt(j)) {
					occur++;
				}
			}
			if (occur3 < occur) {
				most3 = newinput2.charAt(i);
				occur3 = occur;
			}
			occur = 0;

		}
//		System.out.println("Text ohne most2 "+newinput2);
		System.out.println("--Ranking der Zeichen--");
		System.out.print(most1);
		System.out.print(" : " + occur1);
		System.out.println();
		System.out.print(most2);
		System.out.print(" : " + occur2);
		System.out.println();
		System.out.print(most3);
		System.out.print(" : " + occur3);
		s.close();
	}

}

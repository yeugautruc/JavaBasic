package de.ostfalia.gdp.ss19.s3;

import java.util.Scanner;

public class Series3Aufgabe31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Zahlzeit und Wegsbeschreibung eingeben!!!");
		System.out.print("Eingabe : ");
		int time = s.nextInt();
		String path = s.next();
		Boolean valid = true;
		int x = 0;
		int y = 0; // initiate coordinate
		if (time != path.length()) {
			valid = false;
		} else {
			for (int i = 0; i < path.length(); i++) {
				switch (path.charAt(i)) {
				case 'n':
					x = x++;
					break;
				case 's':
					x = x--;
					break;
				case 'w':
					y = y++;
					break;
				case 'e':
					y = y--;
					break;
				}
			}
			valid = (x == 0 & y == 0) ? true : false;
		}
		System.out.println();
		if (valid == true) {
			System.out.print("Wegbeschreibung : gültig");
		} else {
			System.out.print("Wegbeschreibung : nicht gültig");
		}
		s.close();
	}
}

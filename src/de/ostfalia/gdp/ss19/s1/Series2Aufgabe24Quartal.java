package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
public class Series2Aufgabe24Quartal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//System.out.print("Bitte Monat als Zahl eingeben!");
//		System.out.println();
		System.out.print("Eingabe:");
		int monat = scanner.nextInt();
		String aus = monat<1||monat>12 ? "Unerlaubte Eingabe" : "Quartal = "+((monat+2)/3);
		System.out.println(aus);
		scanner.close();
		}		
	}



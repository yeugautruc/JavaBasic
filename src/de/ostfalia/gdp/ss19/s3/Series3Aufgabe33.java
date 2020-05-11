package de.ostfalia.gdp.ss19.s3;

import java.util.Scanner;

public class Series3Aufgabe33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int eingabe = -1;
		System.out.print("Eingabe = ");
		while (eingabe < 0) {
			eingabe = s.nextInt();
		}
		;
		int init = eingabe;
		int quersumme = 0;
		String queraus = "";
		if (eingabe < 10) {
			queraus = queraus + eingabe;
		}
		;
		if (eingabe / 10 == 0) {
			quersumme = eingabe;
		}
		;
		while (eingabe / 10 != 0) {
			int quer = eingabe % 10;
			queraus = queraus + quer;
			eingabe = eingabe / 10;
			if (eingabe != 0) {
				queraus = queraus + " + ";
			}
			;
			if (eingabe < 10) {
				queraus = queraus + eingabe;
				quersumme = quersumme + quer + eingabe;
			} else {
				quersumme = quersumme + quer;
			}
			;
		}
		Boolean harshad = true;
		if (init == 0) {
			harshad = false;
		} else {
			harshad = (init % quersumme == 0) ? true : false;
		}
		;
		System.out.print("Quersumme = " + queraus + " = " + quersumme);
		System.out.println();
		System.out.print("Harshad = " + harshad);
		s.close();
	}

}

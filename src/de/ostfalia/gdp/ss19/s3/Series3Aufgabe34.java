package de.ostfalia.gdp.ss19.s3;

import java.util.Scanner;

public class Series3Aufgabe34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Vom Zahlensystem: ");
		int sysin = s.nextInt();
		System.out.print("in das Zahlensystem: ");
		int sysout = s.nextInt();
		System.out.print("Zahl: ");
		int zahl = s.nextInt();
		int initzahl = zahl;
		// change sysin to 10 System
		int decimal = 0;
		int digit = 0;
		int i = 0;
		while (zahl > 0) {
			digit = zahl % 10;
			zahl = zahl / 10;
			int pow = 1;
			for (int j = 0; j < i; j++) {
				pow = pow * sysin;
			}
			decimal = decimal + digit * pow;
			i++;
		}
		int initdecimal = decimal;
		// change from 10 system to sysout
		String aus = "";
		String reverse = "";
		if (decimal == 0) {
			reverse = "0";
		} else {
			while (decimal > 0) {
				int temp = decimal % sysout;
				decimal = decimal / sysout;
				aus = aus + temp;
			}
			for (int l = aus.length() - 1; l >= 0; l--) {
				reverse = reverse + aus.charAt(l);
			}
		}
		System.out.println();
		System.out.print("Im " + sysin + "er-System ist die Zahl : " + initzahl);
		System.out.println();
		System.out.print("Im " + sysout + "er-System ist die Zahl : " + reverse);
		System.out.println();
		System.out.print("Im " + 10 + "er-System ist die Zahl : " + initdecimal);
		s.close();

	}

}

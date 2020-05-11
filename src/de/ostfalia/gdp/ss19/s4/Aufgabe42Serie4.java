package de.ostfalia.gdp.ss19.s4;

import java.util.Scanner;

public class Aufgabe42Serie4 {
	public static int pow(int a, int b) {
		int temp = a;
		if (b == 0) {
			a = 1;
		}
		if (b > 0) {
			for (int i = 0; i < b - 1; i++) {
				a = a * temp;
			}
		}
		if (b < 0) {
			for (int i = b - 1; i > 0; i++) {
				a = a / temp;
			}
		}
		return a;
	}

	public static String xor(String a, String b) {
		String temp = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				temp = temp + "_";
			} else {
				temp = temp + "x";
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Eingabe : ");
		int n = s.nextInt();
		// System.out.println(pow(2, n)); //to test method pow
		String line = "";
		String templine = "";
		String CBK = "";
		for (int i = 0; i < pow(2, n); i++) {
			CBK = CBK + "_";
		}
		// System.out.println(CBK); //initial CBK with full of "_"

		// Calculate CBK
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < pow(2, n - i - 1); j++) {
				for (int k = 0; k < pow(2, i); k++) {
					line = line + "_";
				}
				for (int k = 0; k < pow(2, i); k++) {
					line = line + "x";
				}

			}
//			System.out.println();
//			System.out.println("line" + line); // to test output line
			templine = line;
			CBK = xor(CBK, templine);
			line = "";
		}
		System.out.println("CBKBIT = " + CBK);
		// print BIT

		for (int i = 0; i < n; i++) {
			System.out.print(i + ". Bit = ");
			for (int j = 0; j < pow(2, n - i - 1); j++) {
				for (int k = 0; k < pow(2, i); k++) {
					System.out.print("_");
				}
				for (int k = 0; k < pow(2, i); k++) {
					System.out.print("x");
				}

			}

			System.out.println();
		}
		s.close();
	}

}

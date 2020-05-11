package de.ostfalia.gdp.ss19.s5;

import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe5Serie5WithBooleanConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahle der Elemente von 1st Array eingeben: ");
		int n = s.nextInt();
		char[] input1 = new char[n];
		System.out.println("Bitte die Elemente von 1st Array eingeben: ");
		for (int i = 0; i < n; i++) {
			input1[i] = s.next().charAt(0);
		}
		System.out.println("Bitte Anzahle der Elemente von 2nd Array eingeben: ");
		int m = s.nextInt();
		char[] input2 = new char[m];
		System.out.println("Bitte die Elemente von 1st Array eingeben: ");
		for (int i = 0; i < m; i++) {
			input2[i] = s.next().charAt(0);
		}
		System.out.println("Eingabe1: " + Arrays.toString(input1));
		System.out.println("Eingabe2: " + Arrays.toString(input2));
		System.out.println("Mischen 1: " + Arrays.toString(mischen(input1, input2)));
		System.out.println("Bitte k eingeben: ");
		int k = s.nextInt();
		System.out.println("Mischen 2: " + Arrays.toString(mischen(input1, input2, k)));
		s.close();
	}
	public static char[] mischen(char[] a, char[] b) {
		if (a == null) {
			if (b == null) {
				return null;
			} else {
				return b;
			}
		} else if (b == null) {
			return a;
		}
		char[] c = new char[a.length + b.length];
		int ai = 0;
		int bi = 0;
		for (int i = 0; i < c.length; i++) {
			if (ai != a.length && (i % 2 == 0 || bi == b.length)) {
				c[i] = a[ai++];
			} else if (bi != b.length) {
				c[i] = b[bi++];
			}
		}
		return c;
	}

	public static char[] mischen(char[] a, char[] b, int k) {
		if (a == null) {
			if (b == null) {
				return null;
			} else {
				return b;
			}
		} else if (b == null) {
			return a;
		}
		char[] c = new char[a.length + b.length];
		int ai = 0;
		int bi = 0;
		boolean endk = false;
		if (k < 1) {
			k = a.length;
		}
		for (int i = 0; i < c.length; i++) {
			if (i % k == 0 && i != 0) {
				endk = !endk;
			}
			if (bi != b.length && (endk || ai == a.length)) {
				c[i] = b[b.length - 1 - bi++];
			} else if (ai != a.length) {
				c[i] = a[ai++];
			}
		}
		return c;
	}
}

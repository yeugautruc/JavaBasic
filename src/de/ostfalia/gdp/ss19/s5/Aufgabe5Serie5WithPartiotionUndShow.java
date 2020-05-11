package de.ostfalia.gdp.ss19.s5;

import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe5Serie5WithPartiotionUndShow {

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
//		System.out.println("Partition 1: ");
//		show(partition(input1, k));
//		System.out.println("Partition 2: ");
//		show(partition(input2, k));

		System.out.println("Mischen 2: " + Arrays.toString(mischen(input1, input2, k)));
		s.close();
	}

//	public static char[] mischen(char[] a, char[] b) {
//		if (a == null) {
//			if (b == null) {
//				return null;
//			}
//		}
//		int aP = a.length - 1;
//		int bP = b.length - 1;
//		int cP = a.length + b.length - 1;
//		char[] c = new char[cP + 1];
//		int ai = 0;
//		int bi = 0;
//		for (int i = 0; i <= cP; i++) {
//			if (aP < bP) {
//				if (ai <= aP) {
//					if (i % 2 == 0) {
//						c[i] = a[ai++];
//					} else {
//						c[i] = b[bi++];
//					}
//				} else {
//					c[i] = b[bi++];
//				}
//			} else {
//				if (bi <= bP) {
//					if (i % 2 == 0) {
//						c[i] = a[ai++];
//					} else {
//						c[i] = b[bi++];
//					}
//				} else {
//					c[i] = a[ai++];
//				}
//			}
//		}
//		return c;
//	}
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
			}
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

	public static char[][] partition(char[] a, int k) {
		int x = 0;
		int y = 0;
		int ai = 0;
		int lengthK = 0;
		if (a.length % k == 0) {
			lengthK = a.length / k;
		} else {
			lengthK = (a.length / k) + 1;
		}
		char[][] c = new char[lengthK][k];
		for (int i = 0; i < lengthK; i++) {
			for (int j = 0; j < k; j++) {
				if (ai < a.length) {
					c[x][y++] = a[ai++];
				}
			}
			x++;
			y = 0;
		}
		return c;
	}

	public static void show(char[][] a) {
		String row = "";
		for (int i = 0; i < a.length; i++) {
			row += "\n";
			for (int j = 0; j < a[i].length; j++) {
				row += a[i][j] + "  ";
			}
		}
		System.out.println("Array:" + row);

	}
}

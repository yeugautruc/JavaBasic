package de.ostfalia.gdp.ss19.s5;

import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe4Serie5SortWith2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahle der Elemente von 1st Array eingeben: ");
		int n = s.nextInt();
		int[] input1 = new int[n];
		System.out.println("Bitte die Elemente von a Array eingeben: ");
		for (int i = 0; i < n; i++) {
			input1[i] = s.nextInt();
		}
		System.out.println("Bitte Anzahle der Elemente von 2nd Array eingeben: ");
		int m = s.nextInt();
		int[] input2 = new int[m];
		System.out.println("Bitte die Elemente von b Array eingeben: ");
		for (int j = 0; j < m; j++) {
			input2[j] = s.nextInt();
		}
		sortieren(input1);
		sortieren(input2);
		System.out.println("Sortierte 1st Arrays: " + Arrays.toString(input1));
		System.out.println("Sortierte 2nd Arrays: " + Arrays.toString(input2));
		System.out.println("Merge und sortierte Arrays: " + Arrays.toString(sortUndMerge(input1, input2)));
		s.close();
	}

	public static int[] sortUndMerge(int[] a, int[] b) {
		if (a == null) {
			if (b == null) {
				return null;
			} else {
				return b;
			}
		} else if (b == null) {
			return a;
		}
		int aL = a.length - 1;
		int bL = b.length - 1;
		int cL = a.length + b.length - 1;
		int[] c = new int[cL + 1];
		for (int i = cL; i > -1; i--) {
			if (aL > -1 && bL > -1) {
				if (a[aL] > b[bL]) {
					c[i] = a[aL--];
				} else {
					c[i] = b[bL--];
				}
			} else if (bL == -1) {
				c[i] = a[aL--];
			} else if (aL == -1) {
				c[i] = b[bL--];
			}
		}
		return c;
	}

	public static void sortieren(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i] < input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
	}
}

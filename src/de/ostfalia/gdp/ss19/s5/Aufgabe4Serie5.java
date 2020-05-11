package de.ostfalia.gdp.ss19.s5;

import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe4Serie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahle der Elemente von 1st Array eingeben: ");
		int n = s.nextInt();
		int[] input1 = new int[n];
		System.out.println("Bitte die Elemente von 1st Array eingeben: ");
		for (int i = 0; i < n; i++) {
			input1[i] = s.nextInt();
		}

		System.out.println("Bitte Anzahle der Elemente von 2nd Array eingeben: ");
		int m = s.nextInt();
		int[] input2 = new int[m];
		System.out.println("Bitte die Elemente von 2nd Array eingeben: ");
		for (int j = 0; j < m; j++) {
			input2[j] = s.nextInt();
		}
		System.out.println("Merge Arrays: " + Arrays.toString(merge(input1, input2)));
		System.out.println("Merge und sortierte Arrays: " + Arrays.toString(sortieren(merge(input1, input2))));
		s.close();
	}

	public static int[] merge(int[] a, int[] b) {
		int[] output = new int[a.length + b.length];
		for (int i = 0; i < a.length; ++i) {
			output[i] = a[i];
		}
		for (int j = a.length; j < (a.length + b.length); ++j) {
			output[j] = b[j - a.length];
		}
		return output;
	}

	public static int[] sortieren(int[] input) {
		
		for (int i = 0; i < input.length; i++) {
			input = bubble(input, i);
		}
		return input;
	}

	public static int[] bubble(int[] input, int i) {
		for (int j = 0; j < input.length; j++) {
			if (input[i] < input[j]) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}
		return input;
	}

}

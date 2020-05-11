package de.ostfalia.gdp.ss19.s5;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe2Serie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Elemente von Array eingeben: ");
		int n = s.nextInt();
		int[] input = new int[n];
		System.out.println("Bitte Elemente von Array eingeben: ");
		for (int i = 0; i < n; ++i) {
			input[i] = s.nextInt();
		}
		System.out.println("Bitte flag eingeben: ");
		boolean flag = s.nextBoolean();
		System.out.println("Die eingebende Array: " + Arrays.toString(input));
		System.out.println("ist geordnet: " + istGeornet(input, flag));
		s.close();
	}

	public static boolean istGeornet(int[] input, boolean flag) {
		boolean geordnet = false;
		if (input == null) {return false;}
		if (steigen(input) == true && flag == true) {
			geordnet = true;
		}
		;
		if (fallen(input) == true && flag == false) {
			geordnet = true;
		}
		return geordnet;
	}

	public static boolean steigen(int[] input) {
		int n = 0;
		boolean steig = false;
		for (int i = 0; i < input.length-1; i++) {
			if (input[i] <= input[i + 1]) {
				n++;
			}
			if (n == (input.length - 1)) {
				steig = true;
			} else {
				steig = false;
			}
		}
		return steig;
	}
	public static boolean fallen(int[] input) {
		int n = 0;
		boolean falle = false;
		for (int i = 0; i < input.length-1; i++) {
			if (input[i] >= input[i + 1]) {
				n++;
			}
			if (n == (input.length - 1)) {
				falle = true;
			} else {
				falle = false;
			}
		}
		return falle;
	}
}

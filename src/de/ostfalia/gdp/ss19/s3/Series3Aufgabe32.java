package de.ostfalia.gdp.ss19.s3;

import java.util.Scanner;

public class Series3Aufgabe32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = -1;
		while (n < 0) {
			System.out.print("Eingabe : ");
			n = s.nextInt();
		}
		System.out.println();
		System.out.print("Fibonacci-Folge : ");
		int fn1 = 1, fn2 = 1, fn = 0;
		for (int i = 0; i < n + 1; i++) {
			if (i == 0) {
				System.out.print(0);
				if (n > 0) {
					System.out.print(", ");
				}
			}
			;
			if (i == 1) {
				System.out.print(1);
				if (n > 1) {
					System.out.print(", ");
				}
			}
			;
			if (i == 2) {
				System.out.print(1);
				if (n > 2) {
					System.out.print(", ");
				}
			}
			;
			if (i > 2) {
				fn = fn2 + fn1;
				fn2 = fn1;
				fn1 = fn;
				System.out.print(fn);
				if (i < n) {
					System.out.print(", ");
				}
				;
			}
		}
		s.close();

	}

}

package de.ostfalia.lounge;

import java.util.Scanner;

public class vorbereitungFürTestat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Gebe mir die Höhe ein: ");
		int row = s.nextInt();
		System.out.println();
		for (int j = 0; j < row; j++) {
			for (int i = 1; i <= 2 * row; i++) {
				if (i <= j || i >= (2 * row - j)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 0; j < row; j++) {
			for (int i = 0; i < (2 * row - 1); i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		s.close();
	}

}

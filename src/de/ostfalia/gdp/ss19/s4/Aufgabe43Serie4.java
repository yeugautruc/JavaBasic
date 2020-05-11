package de.ostfalia.gdp.ss19.s4;

import java.util.Scanner;

public class Aufgabe43Serie4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Anzahl von Simulationsläufe: ");
		int n = s.nextInt();
		int chain = 0;
		int forout = 12;
		int meet = 0; // Anzahle von 3 Folge 12
		double P = 0; // Wahrscheinlichkeit
		for (int i = 0; i < n; i++) {
			int output = (int) (12 * Math.random() + 1);
			if (output == forout) {
				chain++;
			} else {
				chain = 0;
			}
			if (output == 12) {
				forout = output;
			}
			if (chain == 3) {
				meet++;
			}

		}

		System.out.println("Anzahl von 3 Folge 12 gewürfelt: " + meet);
		double meet2 = (double) meet;
		double n2 = (double) n;
		P = meet2 / n2;
		System.out.printf("Wahrscheinlichkeit: %.10f ", P);
	}
}

package de.ostfalia.gdp.ss19.s5;
import java.util.Scanner;
import java.util.Arrays;
public class Aufgabe3Serie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahle der Elemente von Array eingeben: ");
		int n = s.nextInt();
		double[] input = new double[n];
		System.out.println("Bitte die Elemente von Array eingeben: ");
		for(int i=0;i<n;i++) {
			input[i] = s.nextDouble();
		}
		System.out.println("Bitte d eingeben: ");
		int d = s.nextInt();
		System.out.println("Die Steigungsarray: "+ Arrays.toString(steigung(input,d)));
		s.close();
	}
	public static double[] steigung(double[] input, int d) {
		double[] messwert = new double[input.length-1];
		for(int i =0;i<messwert.length;i++) {
			messwert[i] = (input[i+1]-input[i])/d;
		}
		return messwert;
	}
}

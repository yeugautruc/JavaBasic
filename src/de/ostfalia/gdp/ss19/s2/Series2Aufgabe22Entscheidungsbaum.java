package de.ostfalia.gdp.ss19.s2;
import java.util.Locale;
import java.util.Scanner;
public class Series2Aufgabe22Entscheidungsbaum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		//System.out.print("Bitte 4 double-Zahlen eingeben! ");
		//System.out.println();
		System.out.print("Eingabe: ");
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		double D = scanner.nextDouble();
		Double ergebnis = C>D?(A<B?(C<B?B:C):(A<C?C:A)):(B<A?(A<D?D:A):(B<D?D:B));
		System.out.println();
		System.out.print("Ergebnis = " + ergebnis);
		scanner.close();
				
	}

}

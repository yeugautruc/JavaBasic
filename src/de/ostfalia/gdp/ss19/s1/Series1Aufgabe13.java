package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
public class Series1Aufgabe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Menge(g): ");
		int menge = scanner.nextInt();
		System.out.print("Preis (Euro/kg): ");
		double preis = scanner.nextDouble();
		scanner.close();
		System.out.println();
		double gewicht = (double)menge/1000;
		double bezahlen = gewicht * preis;
		int euro = (int) bezahlen/1;
		double cent1 =(bezahlen%1)*100;
		int cent = (int) cent1;
		System.out.printf("Gewicht: %.2f", gewicht);
		System.out.println();
		System.out.print("Euro: "+ euro);
		System.out.println();
		System.out.print("Cent: "+ cent);
		scanner.close();
	}

}

package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
import java.lang.Math;
public class Series1Aufgabe11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Durchmesser des Kegels (int) in mm: ");
		int d=scanner.nextInt();
		int r=d/2;
		System.out.print("Hoehe des Kegel(int) in mm: ");
		int h=scanner.nextInt();
		System.out.println();
		double volume=(Math.PI*r*r*h)/3;
		volume = volume *100;
		int volume1 = (int)volume;
		double volume2 = (double)volume1/100;
		 System.out.println("Volume = " + volume2+" mm^3");
		System.out.println(Math.PI);
		scanner.close();
	}

}

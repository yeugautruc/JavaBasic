package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
public class Series2Aufgabe21Schaltjahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("Eingaben : ");
		int jahr =  scanner.nextInt();
		System.out.println();
		boolean shaltejahr = false;
		shaltejahr = jahr%400==0?true:(jahr%100==0?false:(jahr%4==0?true:false));
		System.out.print("Shaltejahr:  "+ shaltejahr);
		scanner.close();
	}

}

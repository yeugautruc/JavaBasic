package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
public class Series1Aufgabe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 8 Ziffern eingeben: ");
		int bin7=scanner.nextInt();
		int bin6=scanner.nextInt();
		int bin5=scanner.nextInt();
		int bin4=scanner.nextInt();
		int bin3=scanner.nextInt();
		int bin2=scanner.nextInt();
		int bin1=scanner.nextInt();
		int bin0=scanner.nextInt();
		System.out.println();
		System.out.print("Ihre Binäryzahlt: "+bin7+bin6+
				bin5+bin4+bin3+bin2+bin1+bin0);
		System.out.println();
		int dezimal=bin7*(2<<6)+bin6*(2<<5)+bin5*(2<<4)+bin4*(2<<3)+
						bin3*(2<<2)+bin2*(2<<1)+ bin1*2+bin0;
		System.out.print("Ihre Dezimalzahl = "+ dezimal);
		scanner.close();
	}

}

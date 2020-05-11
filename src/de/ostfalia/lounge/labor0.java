package de.ostfalia.lounge;
import java.util.Scanner;
public class labor0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Wie heißt du?"); 
		String name = scanner.next();
		System.out.println("Wie ist meine Martikjelnumme"); 
		String mar = scanner.next();
		System.out.println("Hier ist meine mA, " + mar ); 
		scanner.close();
	}

}

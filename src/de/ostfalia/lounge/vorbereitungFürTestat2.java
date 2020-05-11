package de.ostfalia.lounge;
import java.util.Scanner;
public class vorbereitungFürTestat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Gebe mir die Zahl ein: ");
		int n = s.nextInt();
		System.out.print("Teiler sind: ");
		for (int i = 1; i<=n;i++) {
			if (n%i ==0) {System.out.print(i + " ");}
		}
		s.close();
	}

}

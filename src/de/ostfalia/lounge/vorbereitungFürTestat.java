package de.ostfalia.lounge;
import java.util.Scanner;
public class vorbereitungFürTestat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Hallo, ich denk mir eine Zahl zwischen 1 un 200. Rate mal");
		int secret = (int) (199*Math.random()+1);
		int input = 0;
		int versuch = 1;
		while (input != secret) {
		System.out.print(versuch + ".Versuch:");
		input = s.nextInt();
		if (input < secret ) {System.out.println("Meine Zahl ist größer.");}
		if (input > secret ) {System.out.println("Meine Zahl ist kleiner.");}	
		if (input == secret ) {System.out.println(secret + " ist meiner Zahl. Das waren " + versuch +" Versuche!" );}
		versuch = versuch + 1;
		}
		s.close();
	}

}

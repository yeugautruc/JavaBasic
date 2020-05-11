package de.ostfalia.gdp.ss19.s4;
import java.util.Scanner;
public class DecodeBin5Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Eingabe : ");
		int input = s.nextInt();
		//change input to 5bit binäry code
		int digit = 0;
		String reverse = "";
		String bin = "";
		for (int i = 1; i <33; i ++) {
			digit = input%2;
			input = input/2;
			reverse = reverse + digit;
		}
		System.out.println(reverse);
		//reverse
		for (int i = reverse.length()-1; i>=0;i--) {
			bin = bin + reverse.charAt(i);
		}
		System.out.println(bin);
		//Print out binaerfeld
	}

}

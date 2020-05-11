package de.ostfalia.gdp.ss19.s6;
import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe3Serie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte size von 2D " + "Matrix eingeben: ");
		char[][] input = {{'t','h','i','s',' '},{'i','s',' '},{'t','h','e',' '},
				{'e','n','d',' '},{'o','f',' '},{'t','h','e',' '},{'g','a','m','e'}};
		System.out.println("Array eingabe: ");
		show(input);
		System.out.println("2D Array to 1D: \n" + Arrays.toString(convert(input)));
		System.out.println("Bitte k eingeben:");
		int k = s.nextInt();
		System.out.print("1D Array to 2D: \n");
		show(convert(convert(input),k));
		s.close();
	}

	public static void show(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	public static char[] convert(char[][] a) {
		int index = 0;
		int length1D = 0;
		for (int i = 0; i < a.length; i++) {
			length1D += a[i].length;
		}
		char[] c = new char[length1D];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[index++] = a[i][j];
			}
		}
		return c;
	}

	public static char[][] convert(char[] a, int k) {
		int row = 0;
		if (a.length % k == 0) {
			row = a.length / k;
		} else {
			row = (a.length / k) + 1;
		}
		int indexa = 0;
		char[][] c = new char[row][k];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < k; j++) {
				if (indexa < a.length) {
					c[i][j] = a[indexa++];
				}
			}
		}
		return c;
	}
}

package de.ostfalia.lounge;

import java.util.Arrays;
import java.util.Scanner;

public class ProbeTestat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(Arrays.toString(remove(new int[] {1,2,3,4,5,6,7,8},3)));
		//[1, 2, 4, 5, 7, 8]
		System.out.println(Arrays.toString(remove(new int[] {0,3,-1,5,6,7,-2},2)));
		//[3, -1, 5, 7]
		System.out.println(Arrays.toString(remove(new int[] {2,4,6}, 2)));
		//[]
		System.out.println(compareDiv(12,15));// 1
		System.out.println(compareDiv(7,15));//-1
		System.out.println(compareDiv(7,11));//0
		System.out.println("Bitte Anzahl Element: ");
		int n = s.nextInt();
		System.out.println("Bitte element: ");
		int[] A = new int[n];
		for (int i = 0; i<n;i++) {
			A[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(A));
		System.out.println("Bitte factor: ");
		int f = s.nextInt();
		System.out.println("Removed: " + Arrays.toString(remove(A, f)));
		s.close();
	}

	public static int[] remove(int[] feld, int factor) {
		int nummerMul = 0;
		if(factor ==0 ) return null; else {
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] %factor == 0) {nummerMul++;
				}
			}
		int[] newfeld = new int[feld.length - nummerMul];
		int count = 0;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] != 0) {
				if (feld[i] % factor != 0) {
					newfeld[count++] = feld[i];
				}
			}
		}
		return newfeld;}
	}
	public static int compareDiv(int a, int b) {
		int counta=0;
		int countb=0;
		int output =0;
		for(int i =1;i<=a;i++) {
			if(a%i==0) {counta++;}
		}
		for(int i =1;i<=b;i++) {
			if(b%i==0) {countb++;}
		}
		if (counta>countb) output = 1;
		else if(counta==countb) output = 0;
		else if(counta<countb) output = -1;
		return output;
	}
}

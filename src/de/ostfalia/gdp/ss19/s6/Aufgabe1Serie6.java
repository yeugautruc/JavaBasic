package de.ostfalia.gdp.ss19.s6;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe1Serie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte die size von erste Array eingeben: ");
		int xa = s.nextInt();
		int ya = s.nextInt();
		System.out.println("Bitte die Element von erste Array eingeben: ");
		double[][] a = new double[xa][ya];
		for (int i = 0; i < xa; i++) {
			for (int j = 0; j < ya; j++) {
				System.out.println("A[" + i + "]" + "[" + j + "] = ");
				a[i][j] = s.nextDouble();
			}
		}
		System.out.println("Bitte die size von zweite Array eingeben: ");
		int xb = s.nextInt();
		int yb = s.nextInt();
		System.out.println("Bitte die Element von zweite Array eingeben: ");
		double[][] b = new double[xb][yb];
		for (int i = 0; i < xb; i++) {
			for (int j = 0; j < yb; j++) {
				System.out.println("A[" + i + "]" + "[" + j + "] = ");
				b[i][j] = s.nextDouble();
			}
		}
		s.close();
		System.out.println("Array A:");
		show(a);
		System.out.println("Array B:");
		show(b);
		if (xa == xb && ya == yb) {
			System.out.println("Array A+B = ");
			show(matrixAddition(a, b));
			System.out.println("Array aT = ");
			show(matrixTransposition(a));
			System.out.println("Array bT = ");
			show(matrixTransposition(b));
		} else {
			System.out.println("Size ist ungleich! ");
		}
	}

	public static void show(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	public static double[][] matrixAddition(double[][] a, double[][] b) {
		int row = a.length;
		int column = a[0].length;
		double[][] c = new double[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static double[][] matrixTransposition(double[][] a)
	{	int row = a.length;
		int column = a[0].length;
		double[][] anew = new double[column][row];
		for (int i = 0; i<anew.length;i++) {
			for(int j =0;j<anew[0].length;j++) {
				anew[i][j]=a[j][i];
			}
		}
		return anew;
	}
}
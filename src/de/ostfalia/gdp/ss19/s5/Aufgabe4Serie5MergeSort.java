package de.ostfalia.gdp.ss19.s5;

import java.util.Scanner;
import java.util.Arrays;

public class Aufgabe4Serie5MergeSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahle der Elemente von 1st Array eingeben: ");
		int n = s.nextInt();
		int[] input1 = new int[n];
		System.out.println("Bitte die Elemente von 1st Array eingeben: ");
		for (int i = 0; i < n; i++) {
			input1[i] = s.nextInt();
		}

		System.out.println("Bitte Anzahle der Elemente von 2nd Array eingeben: ");
		int m = s.nextInt();
		int[] input2 = new int[m];
		System.out.println("Bitte die Elemente von 2nd Array eingeben: ");
		for (int j = 0; j < m; j++) {
			input2[j] = s.nextInt();
		}
		System.out.println("Merge Arrays: " + Arrays.toString(merge(input1, input2)));
		int[] newinput = merge(input1, input2);
		mergeSort(newinput, newinput.length);
		System.out.println("Merge und sortierte Arrays: " + Arrays.toString(newinput));
		s.close();
	}

	public static int[] merge(int[] a, int[] b) {
		int[] output = new int[a.length + b.length];
		for (int i = 0; i < a.length; ++i) {
			output[i] = a[i];
		}
		for (int j = a.length; j < (a.length + b.length); ++j) {
			output[j] = b[j - a.length];
		}
		return output;
	}

	public static void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	}
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			  
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}

}

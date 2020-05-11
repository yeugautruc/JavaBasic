package de.ostfalia.gdp.ss19.s5;
import java.util.Arrays;
import java.util.Scanner;
public class mergeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Elemente von Array eingeben: ");
		int n = s.nextInt();
		int[] input = new int[n];
		System.out.println("Bitte Elemente von Array eingeben: ");
		for(int i = 0; i<n;i++) {
			input[i]=s.nextInt();
		}
		mergeSort(input,n);
		System.out.println("Mergesort: "+ Arrays.toString(input));
		s.close();
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

package de.ostfalia.lounge;

public class test58 {

	public static void main(String[] args){
		int[] bfeld = { 1, 2, 3, 4, 5, 6 };
		int[] cfeld;
		 cfeld = scaleModify(bfeld,3);
		 //Resultat ausgeben
		 for(int n: cfeld){
		 System.out.print(n+", ");
		 }
		 System.out.println();
		 //bfeld ausgeben
		 for(int n: bfeld){
		 System.out.print(n+", ");
		 }
		 }
		static int[] scaleModify(int[] afeld, int scale){
		 for(int i=0; i < afeld.length ; i++){
		 afeld[i] *=scale;
		 }
		 return afeld;
		 } 

}

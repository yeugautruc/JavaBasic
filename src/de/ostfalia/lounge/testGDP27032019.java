package de.ostfalia.lounge;

public class testGDP27032019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ausgabe1		
		System.out.println("Ausgabe 1");
		for (int i = 1; i <= 6; i++) {
					for (int k=(6-i) ;k >=1; k--){
						System.out.print(".");
						}
			for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
			System.out.println();
			}
		//ausgabe 1 andere Lösung		
				for (int i = 1; i <= 6; i++) {
					for (int j = 6; j >=1; j--) {
					System.out.print(i>=j?i:".");
					}
					System.out.println();
					}
		//ausgabe2		
		System.out.println("Ausgabe 2");
		for (int i = 1; i <= 6; i++) {
					for (int k=(6-i) ;k >=1; k--){
						System.out.print(".");
						}
					for (int j = 1; j <= i; j++) {
			System.out.print(i);
			}
			System.out.println();
			for (int l = 1; l <= 6; l++) {
				System.out.print("*");}
			System.out.println();
			}
		//ausgabe3
		System.out.println("Ausgabe 3");
		for (int i = 1; i <= 6; i++) {
					int j=i;
					for (int k=(6-i) ;k >=1; k--){
						System.out.print(".");
						}
					System.out.print(i);
					for (int l=(j-1) ;l >=1; l--){
						System.out.print(".");
						}
					System.out.println();
			}
		//ausgabe3 andere Lösung
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >=1; j--) {
			System.out.print(i==j?i:".");
			}
			System.out.println();
		}
			
				
	}

}

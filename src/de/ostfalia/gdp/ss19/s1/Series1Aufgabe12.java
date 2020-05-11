package de.ostfalia.gdp.ss19.s1;
import java.util.Scanner;
public class Series1Aufgabe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ist Tor 1 geschlossen? ");
		boolean tor1geschlossen = scanner.nextBoolean();
		System.out.print("Ist Tor 1 verriegelt? ");
		boolean tor1verriegelt = scanner.nextBoolean();
		System.out.print("Ist Tor 2 geschlossen? ");
		boolean tor2geschlossen = scanner.nextBoolean();
		System.out.print("Ist Tor 2 verriegelt? ");
		boolean tor2verriegelt = scanner.nextBoolean(); 
		System.out.println();
		boolean bedingungen1 = ((tor1geschlossen&&tor1verriegelt)||(tor2geschlossen&&tor2verriegelt));
		System.out.print("Bedingungen 1 = "+ bedingungen1);
		System.out.println();
		System.out.print("Ist Zell 1 Tür geschlossen? ");
		boolean zellTuer1geschlossen = scanner.nextBoolean();
		System.out.print("Ist Zell 2 Tür geschlossen? ");
		boolean zellTuer2geschlossen = scanner.nextBoolean();
		System.out.print("Ist Zell 3 Tür geschlossen? ");
		boolean zellTuer3geschlossen = scanner.nextBoolean();
		System.out.println();
		boolean bedingungen2 = zellTuer1geschlossen&&(zellTuer2geschlossen||zellTuer3geschlossen)
				||(zellTuer2geschlossen&&zellTuer3geschlossen);
		System.out.print("Bedingungen 2 = "+ bedingungen2);
		System.out.println();
		System.out.print("Ist Zellenbblock Tür geschlossen? ");
		boolean zellenblockTuergeschlossen= scanner.nextBoolean();
		System.out.println();
		boolean bedingungen3 = zellenblockTuergeschlossen&&(zellTuer1geschlossen
				||zellTuer2geschlossen||zellTuer3geschlossen );
		System.out.print("Bedingungen 3 = "+ bedingungen3);
		boolean securitystate = bedingungen1&&bedingungen2&&bedingungen3;
		System.out.println();
		System.out.print("Securitystate = "+ securitystate);
		scanner.close();
	}

}

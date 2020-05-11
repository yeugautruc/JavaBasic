package de.ostfalia.gdp.ss19.s7;

public class Aufgabe1Serie7 {

	public static void main(String[] args) {
		konto1 acc1 = new konto1();
		acc1.setKontoinhaber("DoanManhHung");
		acc1.setKontostand(0);
		acc1.einzahlen(1000);
		System.out.println(acc1.getBeschreibung());
		System.out.println("Withdraw 2000?: " + acc1.abheben(2000));
		System.out.println();
		konto1 acc2 = new konto1();
		acc2.setKontoinhaber("NguyenKhanhLinh");
		acc2.setKontostand(0);
		acc2.einzahlen(2000);
		System.out.println(acc2.getBeschreibung());
		System.out.println("Withdraw 3000?: " + acc2.abheben(3000));
		System.out.println();
		System.out.println("Transfer 3000 from Linh to Hung: ");
		System.out.print("Transfer: ");
		if (acc2.abheben(3000) == true) {
			acc1.einzahlen(3000); System.out.print("Success!");}
		else 
			System.out.println("Not enough money!");
		System.out.println("Account from " + acc1.getKontoinhaber() + " now have: " + acc1.getKontostand());
		System.out.println("Account from " + acc2.getKontoinhaber() + " now have: " + acc2.getKontostand());
		System.out.println();
		System.out.println("Transfer 1000 from Linh to Hung: ");
		System.out.print("Transfer: ");
		if (acc2.abheben(1000) == true) {
			acc1.einzahlen(1000);System.out.println("Success!");}
	else 
		System.out.println("Not enough money!");
		System.out.println("Account from " + acc1.getKontoinhaber() + " now have: " + acc1.getKontostand());
		System.out.println("Account from " + acc2.getKontoinhaber() + " now have: " + acc2.getKontostand());
	}

	public static class konto1 {
		private String kontoinhaber;

		public String getKontoinhaber() {
			return kontoinhaber;
		}

		public void setKontoinhaber(String name) {
			kontoinhaber = name;
		}

		private double kontostand;

		public double getKontostand() {
			return kontostand;
		}

		public void setKontostand(double k) {
			kontostand = k;
		}

		public void einzahlen(double betrag) {
			kontostand = kontostand + betrag;
		}

		public boolean abheben(double betrag) {
			if (betrag > kontostand) {
				return false;
			} else {
				kontostand -= betrag;
				return true;
			}
		}

		public String getBeschreibung() {
			String output = "Konto: " + kontoinhaber + ", " + kontostand;
			return output;
		}
	}

}
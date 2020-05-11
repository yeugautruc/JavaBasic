package Testat3;

public class Posten {
	private String name;
	private int stueck;
	private double preis;

	public Posten(String name, int stueck, double preis) {
		this.name = name;
		this.stueck = stueck;
		this.preis = preis;
	}
	public void setStueck(int neueAnzahl) {
		this.stueck = neueAnzahl;
	}
	public String getName() {
		return name;
	}

	public int getStueck() {
		return stueck;
	}

	public double getPreis() {
		return preis;
	}

	public String toString() {
		String out = "" + stueck + " x " + name + " (" + preis + ") = " + (preis * stueck) + " Euro";
		return out;
	}

}

package Testat3;

public class EinkaufsListen {
	private Posten[] einkaufsListen = new Posten[] {};
	private int counter = 0;

	public EinkaufsListen(int lang) {
		einkaufsListen = new Posten[lang];
	}

	public boolean fuegePostenHinzu(Posten p) {
		try {
			einkaufsListen[counter++] = p;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public double getEndpreis() {
		double out = 0;
		for (int i = 0; i < einkaufsListen.length; i++) {
			out = out + einkaufsListen[i].getPreis() * einkaufsListen[i].getStueck();
		}
		return out;
	}

	public boolean aenderenStueckzahl(String name, int neueAnzahl) {
		for (int i = 0; i < einkaufsListen.length; i++) {
			if (einkaufsListen[i].getName().equals(name) && einkaufsListen[i].getStueck() >= neueAnzahl) {
				einkaufsListen[i].setStueck(neueAnzahl);
				return true;
			}
		}
		return false;
	}
}

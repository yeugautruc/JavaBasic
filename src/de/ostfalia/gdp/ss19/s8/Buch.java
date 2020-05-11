package de.ostfalia.gdp.ss19.s8;

public class Buch {
	private int id;
	private String titel;
	private String inhalt;
	private Autor autor;
	private static int anzahl=1;

	public Buch(Autor a, String t, String i) {
		this.titel = t;
		this.inhalt = i;
		this.autor = a;
		id = anzahl;
		anzahl++;
	}

	public void setId(int in) {
		this.id = in;
	}

	public void setTitel(String in) {
		this.titel = in;
	}

	public void setInhalt(String in) {
		this.inhalt = in;
	}

	public int getId() {
		return this.id;
	}

	public String getInhalt() {
		return this.inhalt;
	}

	public String getTitel() {
		return this.titel;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public boolean equals(Buch in) {
		boolean out = false;
		if (this.titel.equals(in.titel) && this.autor.equals(in.autor))
			out = true;
		else
			out = false;
		return out;
	}

	public String toString() {
		String out = "ID: " + this.id + "; Titel: " + this.titel + "; Autor: " + this.autor.getName();
		return out;
	}
}

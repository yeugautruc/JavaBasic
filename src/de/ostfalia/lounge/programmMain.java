package de.ostfalia.lounge;

public class programmMain {

	public static void main(String[] args) {
		autor glukhovksy = new autor("Dmitry Glukhovsky", "d.glukhovsky@yandex.ru");
		buch metro2033 = new buch("Metro 2033", "Artyom", glukhovksy);
		buch metro2034 = new buch("Metro 2034", "Hunter", glukhovksy);
		autor lovecraft = new autor("H.P. Lovecraft", "n/a");
		buch shadow = new buch("The Shadow Over Innsmouth", "Cthulu", lovecraft);
		buch mountains = new buch("At The Mountains Of Madness", "Shub-Niggurath", lovecraft);
		buch sarnath = new buch("The Doom That Came To Sarnath", "Fish People", lovecraft);
		autor laidlaw = new autor("Marc Laidlaw", "m.laidlaw@valvesoftware.com");
		buch mandala = new buch("The 37th Mandala", "Comes Another", laidlaw);
		autor bradbury = new autor("Ray Bradbury", "r.bradbury@aol.com");
		buch illustrated = new buch("The Illustrated Man", "Mr. Biggest Grapefruit", bradbury);
		bibliothek bib = new bibliothek();
		System.out.println(bib.registriereAutor(glukhovksy));
		System.out.println(bib.registriereBuch(metro2033));
		System.out.println(bib.registriereBuch(metro2034));
		System.out.println(bib.registriereAutor(lovecraft));
		System.out.println(bib.registriereBuch(shadow));
		System.out.println(bib.registriereBuch(mountains));
		System.out.println(bib.registriereBuch(sarnath));
		System.out.println(bib.registriereAutor(laidlaw));
		System.out.println(bib.registriereBuch(mandala));
		System.out.println(bib.registriereAutor(bradbury));
		System.out.println(bib.registriereBuch(illustrated));
		System.out.println(bib.suchAutor("Dmitry Glukhovsky").toString());
		System.out.println(java.util.Arrays.toString(bib.suchBuecher("3")));
		System.out.println(bib.toString());
	}
}

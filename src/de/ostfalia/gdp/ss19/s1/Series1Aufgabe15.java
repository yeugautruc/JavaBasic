package de.ostfalia.gdp.ss19.s1;

public class Series1Aufgabe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 7; j = 1 + j - j / 3 - 2;
		System.out.print(j);
		System.out.println();
		double d = 3 * 7 % 5 / (1 + 1.0);
		System.out.print(d);
		System.out.println();
		int b = 0b111+011+0x11;
		System.out.print(b);
		System.out.println();
		int m = -3;
		m = (m < -2) ? (14 & 9) << 3 : (8 | 1) << 2;
		System.out.print(m);
		System.out.println();
		int k, l = 4;
		String ba = "Bonne Chance " + (k = l++ * l++) + --k;
		System.out.print(ba);
		System.out.println();
		double s=0.5;
		short e=1;
		s=1e0;
		System.out.println(s);
			
	}

}

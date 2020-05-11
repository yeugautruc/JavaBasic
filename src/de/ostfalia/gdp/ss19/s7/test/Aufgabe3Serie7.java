package de.ostfalia.gdp.ss19.s7.test;

public class Aufgabe3Serie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GemBruch gem0 = new GemBruch(1,1, 3);
		GemBruch gem1 = new GemBruch(-1,1, 3);
		System.out.println(gem1.toString() + " und " + gem0.toString());
		gem1.add(gem0);
		System.out.println("Added: " + gem1.toString());
		GemBruch gem2 = new GemBruch(-1, 1, 3);
		gem2.sub(gem0);
		System.out.println("Subtracted: " + gem2.toString());
		GemBruch gem3 = new GemBruch(-1, 1, 3);
		gem3.mul(gem0);
		System.out.println("Multiplied: " + gem3.toString());
		GemBruch gem4 = new GemBruch(-1, 1, 3);
		gem4.div(gem0);
		System.out.println("Divided: " + gem4.toString());
	}

	public static GemBruch fraction(int numera, int denomi) {
		// change from simplify fraction to mixed number
		int newg = 0;
		int newz = 0;
		int newn = 1;
		newg = numera / denomi;
		if (newg == 0) {
			newz = numera;
			newn = denomi;
		} else if (newg > 0) {
			newz = numera % denomi;
			newn = denomi;
		} else {
			newz = (-numera) % denomi; // if g <0 => numera <0 => z = (-numera) % denomi
			newn = denomi;
		}
		GemBruch out = new GemBruch(newg, newz, newn);
		return out;
	}

	public static class GemBruch {
		String form = "";
		int g = 0;
		int z = 0;
		int n = 1;

		public GemBruch(int g, int z, int n) {
			this.g = g;
			this.z = z;
			this.n = n;
		}

		public GemBruch(int z, int n) {
			this.z = z;
			this.n = n;
			this.g = 0;
		}

		public GemBruch(int g) {
			this.g = g;
			this.z = 0;
			this.n = 1;
		}

// extra method
		public int numera() {
			int a = 0;
			if (g == 0)
				a = z;
			else {
				if (g > 0)
					a = g * n + z;
				else
					a = g * n - z;
			}
			return a;
		}

		public void simplify() {
			// simplify fraction
			for (int i = n; i > 0; i--) {
				if (n % i == 0 && z % i == 0) {
					n = n / i;
					z = z / i;
					i = 0;
				}
			}
		}

		public GemBruch signInvert(GemBruch a) {
			int bg = 0;
			int bz = 0;
			int bn = a.n;
			if (a.g == 0)
				bz = -a.z;
			else {
				bg = -a.g;
				bz = a.z;
			}
			GemBruch b = new GemBruch(bg, bz, bn);
			return b;
		}

		public GemBruch invert(GemBruch a) {
			int bg = 0;
			int bz = 0;
			int bn = 0;
			int oa = a.numera();
			bg = a.n / oa;
			if (a.g >= 0)
				bz = a.n % oa;
			else
				bz = -a.n % oa;
			if (a.g >= 0)
				bn = oa;
			else
				bn = -oa;
			GemBruch b = new GemBruch(bg, bz, bn);
			return b;
		}

// end extra method
		public GemBruch add(GemBruch a) {
			int o = numera();
			int oa = a.numera();
			int outnum = o * a.n + oa * n;
			int outden = n * a.n;
			GemBruch out = fraction(outnum, outden);
			return out;
		}

		public GemBruch sub(GemBruch a) {
			GemBruch out = add(signInvert(a));
			return out;
		}

		public GemBruch mul(GemBruch a) {
			int o = numera();
			int oa = a.numera();
			int outnum = o * oa;
			int outden = n * a.n;
			GemBruch out = fraction(outnum, outden);
			return out;
		}

		public GemBruch div(GemBruch a) {
			GemBruch out = mul(invert(a));
			return out;
		}

		public String toString() {
			simplify();
			String output = "";
//			if (z % n == 0)
//				output = "" + (g + z / n);
//			else if (z > n) {
//				if (g == 0) {
//					if (z == 0)
//						output = "" + 0;
//					else if (z > 0)
//						output = z / n + "_" + z % n + "/" + n;
//					else
//						output = z / n + "_" + (-z) % n + "/" + n;
//				} else if (this.z == 0)
//					output = "" + g;
//				else if (z / n > 0 && g > 0 || z / n < 0 && g < 0 || g > 0 && z / n < 0)
//					output = (g + z / n) + "_" + z % n + "/" + n;
//				else
//					output = (g - z / n) + "_" + z % n + "/" + n;
//
//			} else {
				if (g == 0) {
					if (z == 0)
						output = "" + 0;
					else
						output = z + "/" + n;
				} else if (this.z == 0)
					output = "" + g;
				else
					output = g + "_" + z + "/" + n;
//			}
			return output;
		}
	}
}

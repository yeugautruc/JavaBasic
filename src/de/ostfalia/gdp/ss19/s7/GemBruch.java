package de.ostfalia.gdp.ss19.s7;

public class GemBruch {
	String form = "";
	int g = 0;
	int z = 0;
	int n = 1;

	public GemBruch fraction(int numera, int denomi) {
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

		if ( z >0) {
			if (z >n ) {
				if (g>0)
				g = g + z/n; else g=g-z/n;
				z = z%n;
			}
		} else {
			if (Math.abs(z)>n) {
				g = g + z/n;
				z = z%n;
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
		g = out.g;
		z = out.z;
		n = out.n;
		GemBruch out1 = new GemBruch(g, z, n);
		return out1;
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
		g = out.g;
		z = out.z;
		n = out.n;
		GemBruch out1 = new GemBruch(g, z, n);
		return out1;
	}

	public GemBruch div(GemBruch a) {
		GemBruch out = mul(invert(a));
		return out;
	}

	public String toString() {
			simplify();
			String output = "";
			if (g == 0) {
				if (z == 0)
					output = "" + 0;
				else
					output = z + "/" + n;
			} else if (this.z == 0)
				output = "" + g;
			else
				output = g + "_" + z + "/" + n;}return output;
}}
package de.ostfalia.gdp.ss19.s8;

public class Bibliothek {
	private Autor[] autorenA = new Autor[1024];
	private Buch[] buecherA = new Buch[1024];
	private int counterB = 0;
	private int counterA = 0;

	public boolean registriereAutor(Autor in) {
		boolean out = false;
		for (int i = 0; i < autorenA.length; i++) {
			if (autorenA[i] != null) {
				if (autorenA[i].getName().equals(in.getName())) {
					out = true;
				}
			}
		}
		if (out == false) {
			autorenA[counterA] = in;
			if (in.getId() == 0) {
				in.setId(counterA + 1);
			}
			counterA++;
		}
		return !out;
	}

	public boolean registriereBuch(Buch in) {
		boolean out = false;
		for (int i = 0; i < autorenA.length; i++) {
			if (buecherA[i] != null) {
				if ((!(sucheAutor(in.getTitel()) == null)) || (!(sucheAutor(in.getInhalt()) == null))) {
					out = true;
				}
			}
		}
		if (out == false) {
			buecherA[counterB] = in;
			counterB++;
		}

		return !out;
	}

	public Autor sucheAutor(String begriff) {
		for (int i = 0; i < counterA; i++) {
			if (autorenA[i].getName().equals(begriff))
				return autorenA[i];
		}
		return null;
	}

	public Buch[] sucheBuecher(String begriff) {
		if (!buecherA.equals(null)) {
			Buch[] out = new Buch[buecherA.length];
			int found = 0;
			String low = begriff.toLowerCase();
			for (int j = 0; j < buecherA.length; j++) {
				if (buecherA[j] != null)
					if (((buecherA[j].getInhalt().toLowerCase().contains(low))
							|| (buecherA[j].getTitel().toLowerCase().contains(low)))) {
						out[found++] = buecherA[j];
					}
			}
			Buch[] out1 = new Buch[found];
			for (int i = 0; i < found; i++) {
				out1[i] = out[i];
			}
			return out1;
		}
		return new Buch[0];
	}

	public int anzahlAutoren() {
		int count = 0;
		for (int i = 0; i < autorenA.length; i++) {
			if (autorenA[i] != null) {
				count++;
			}
		}
		return count;
	}

	public int anzahlBuecher() {
		int count1 = 0;
		for (int i = 0; i < buecherA.length; i++) {
			if (buecherA[i] != null) {
				count1++;
			}
		}
		return count1;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("autorenAA: " + counterA).append("\n");
		for (int i = 0; i < counterA; i++) {
			builder.append(autorenA[i].toString()).append("\n");
		}
		builder.append("buecherA: " + counterB).append("\n");
		for (int i = 0; i < counterB; i++) {
			builder.append(buecherA[i].toString()).append("\n");
		}
		return builder.toString();
	}
}

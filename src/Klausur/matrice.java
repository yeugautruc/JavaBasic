package Klausur;

public class matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[][] out = new int[2 * n - 1][2 * n - 1];
		int ten=n;
			for (int i = 0; i < n; i++) {
				for (int j = i ; j < n; j++) {
					out[i][j] =  ten--;
				}
				ten =n;
			}
		
		int[][] out1 = new int[2 * n - 1][2 * n - 1];
		int temp=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n-1; j++) {
				out1[i][j] = temp++;
			}
		}
		out = spiegeln(out);
		out1 = spiegeln(out1);
		for (int i = 0; i < out.length; i++) {
			for (int j = 0; j < out.length; j++) {
				System.out.print(out[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < out1.length; i++) {
			for (int j = 0; j < out1.length; j++) {
				if (out1[i][j]>9)
				System.out.print(out1[i][j] + "  ");
				else System.out.print(out1[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static int[][] spiegeln(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				// Spiegelt den linken oberen Quadranten nach unten rechts
				input[input.length - i - 1][input.length - j - 1] = input[i][j];
				// Spiegelt den oberen linken Quadranten nach oben rechts und den unteren
//		rechten Quadranten nach unten links
				input[i][input.length - j - 1] = input[i][j];
//				input[input.length - i - 1][j] = input[i][j];
			}
		}
		return input;
	}
}

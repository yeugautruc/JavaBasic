package Klausur;

public class klausurVorbereitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		  int[][] out = new int[2*n-1][2*n-1];
		  for(int a =0; a<n;a++)
		  {
		    for(int i=a; i<n;i++){
		      for(int j = n-i-1+a;j<(n+i-a);j++){
		      out[i][j] = a+1;}}
		}

		 out = spiegeln(out);
		  
		for (int i = 0; i < out.length; i++) {
			for (int j = 0; j < out.length; j++) {
				System.out.print(out[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] spiegeln(int[][] input) {
		for(int i = 0; i < input.length; i++) {
		for(int j = 0; j < input.length; j++) {
		//Spiegelt den linken oberen Quadranten nach unten rechts
		input[input.length - i - 1][input.length - j - 1] = input[i][j];
		//Spiegelt den oberen linken Quadranten nach oben rechts und den unteren
//		rechten Quadranten nach unten links
		input[i][input.length - j - 1] = input[i][j];
		}
		}
		return input;
		}

}

package de.ostfalia.lounge;

public class Rekursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 70707;
		String s = "Beispiel";
		System.out.println("Ergebniss: " + quer(n));
	}

	public static int quer(int n) {
		if (n < 10)
			return n;
		else {
			int digit = n % 10;
			int temp = n;
			n = temp / 10;
			return quer(n) + digit;
		}
	}
	public static String umdrehen( String s) {
		String s1= s;
		if (s1.length()==1) return s;
		else {
			char temp = s.charAt(0);
			s1.charAt(s.length()-1) = temp;
			
			
			}
		}
	}

package de.ostfalia.gdp.ss19.s2;
import java.util.Locale;
import java.util.Scanner; 
public class Series2Aufgabe23Dreieck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.ENGLISH);
		System.out.print("Bitte Länge der drei Seiten c, b und a eingeben: ");
		double c = s.nextDouble();
		double b = s.nextDouble();
		double a = s.nextDouble();
		System.out.println();
		if ((a>(b+c))||(b>(a+c))||(c>(b+a)))
				{
					System.out.print("Sie habe ungültige Länge der Seiten eingegeben!!!");
					s.close();
					return;
				}; 		//check the edge length, if they are valid
				
		double alpha =Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*c*b)));
		double beta =Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
		double gamma =Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));
		int i;
		if (a==b&&b==c) { i=1;}
			else {
				if (a==b||a==c||b==c) {i=2;} else {i=3;};
			};
			String edgecategory = null, anglecategory = null;
			switch (i) {
			case 1: System.out.println("--Länge der Seiten--");
					System.out.printf("abc = %.2f", a);
					System.out.print(" cm\n");
					System.out.println("--Winkel--");
					System.out.printf("\u03B1 \u03b2 \u03b3 = %.2f" ,alpha);
					System.out.print("\u00B0 \n");
					edgecategory = "gleichseitiges";
					anglecategory = "";
					System.out.println();
					System.out.println("Es handelt sich um ein "+edgecategory+" "+anglecategory+" Dreieck.");
					break;
			case 2: System.out.println("--Länge der Seiten--");
					if (b==c&&c!=a) 
							{
							System.out.printf("a = %.2f", a);
							System.out.print(" cm\n");
							System.out.printf("bc = %.2f", b);
							System.out.print(" cm\n");
							System.out.println("--Winkel--");
							System.out.printf("\u03B1 = %.2f" ,alpha );
							System.out.print("\u00B0 \n");
							System.out.printf("\u03B2\u03B3 = %.2f",beta);
							System.out.print("\u00B0 \n");
							};
					if (a==b&&c!=a) 
							{
							System.out.printf("c = %.2f", c);
							System.out.print(" cm\n");
							System.out.printf("ab = %.2f", b);
							System.out.print(" cm\n");
							System.out.println("--Winkel--");
							System.out.printf("\u03B3 = %.2f", gamma);
							System.out.print("\u00B0 \n");
							System.out.printf("\u03B1\u03B2 = %.2f", alpha);
							System.out.print("\u00B0 \n");
							};
					if (a==c&&c!=a) 
							{
							System.out.printf("b = %.2f", b);
							System.out.print(" cm\n");
							System.out.printf("ac = %.2f", a);
							System.out.println("--Winkel--");
							System.out.printf("\u03B2 = %.2f" ,beta);
							System.out.print("\u00B0 \n");
							System.out.printf("\u03B1\u03B3 = %.2f" , alpha);
							System.out.print("\u00B0 \n");
							};
					edgecategory = "gleichschenkliges";
					if (alpha<90&&beta<90&&gamma<90)
							{anglecategory = "spitzwinkles";};
					if ((-0.0015<(alpha-90))&&((alpha-90)<0.0015)
							||(-0.001<(beta-90))&&((beta-90)<0.0015)
								||(-0.0015<(gamma-90))&&((gamma-90)<0.0015)) 
									{anglecategory="rechtwinkliges";};
					if (alpha>90||beta>90||gamma>90) {anglecategory="stumpfwinkliges";};
					System.out.println();
					System.out.println("Es handelt sich um ein "+edgecategory+" "+anglecategory+" Dreieck.");
					break;
			case 3: System.out.println("--Länge der Seiten--");
					System.out.printf("a = %.2f", a);
					System.out.print(" cm\n");
					System.out.printf("b = %.2f", b);
					System.out.print(" cm\n");
					System.out.printf("c = %.2f", c);
					System.out.print(" cm\n");
					System.out.println("--Winkel--");
					System.out.printf("\u03B1 = %.2f" ,alpha);
					System.out.print("\u00B0 \n");
					System.out.printf("\u03B2 = %.2f" , beta);
					System.out.print("\u00B0 \n");
					System.out.printf("\u03B3 = %.2f" , gamma);
					System.out.print("\u00B0 \n");
					edgecategory = "unregelmäßiges";
					if (alpha<91&&beta<91&&gamma<91)
					{anglecategory = "spitzwinkles";};
					if ((-0.0015<(alpha-90))&&((alpha-90)<0.0015)
							||(-0.001<(beta-90))&&((beta-90)<0.0015)
								||(-0.0015<(gamma-90))&&((gamma-90)<0.0015)) 
									{anglecategory="rechtwinkliges";};
					if (alpha>90||beta>90||gamma>90) {anglecategory="stumpfwinkliges";};
					System.out.println();
					System.out.println("Es handelt sich um ein "+edgecategory+" "+anglecategory+" Dreieck.");
					break;
			}

			/*System.out.println("\u03B3 =" +(gamma-90)); 
			 * to check value of Precision exp: -0.0015<(alpha-90)
			 * the correct one is 
			 * if (alpha==90||beta==90||gamma=90){anglecategory="rechtwinkliges";};
			 * the entered edge length could not precise  0,0015. */
			s.close();
	}

}

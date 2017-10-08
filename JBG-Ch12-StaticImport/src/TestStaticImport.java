import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class TestStaticImport {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite int koeficijente kvadratne jednacine");
		System.out.print("Koristeci razmak: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		//System.out.printf("a=%d\t b=%d\t c=%d\n", a, b, c);
		double x1=(-b+sqrt(pow(b,2)-4*a*c))/(2*a);
		double x2=(-b-sqrt(pow(b,2)-4*a*c))/(2*a);
		System.out.printf("Resenje kvadratne jednacine "
						+ "%dx^2 + %dx + %d:\n", a, b, c);
		System.out.printf("x1=%35656.2f\t x2=%.2f\n", x1, x2);
		
		System.out.print("\nUnesite poluprecnik kruga: ");
		int r=input.nextInt();
		double P=pow(r,2)*PI;
		double O=2*r*PI;
		System.out.println("P= " + P);
		System.out.println("O= " + O);
	}

}

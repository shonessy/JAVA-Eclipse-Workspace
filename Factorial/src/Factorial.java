import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int n;
		Scanner unos=new Scanner(System.in);
		
		System.out.print("Unesite broj za racunanje faktorijala: ");
		n=unos.nextInt();
		System.out.printf("Faktorijal broja %d je: %d", n, factorial(n));
	}

	public static int factorial(int x){
		int fact=1;
		for(int i=x;i>1;i--)
			fact*=i;
		return fact;		
		}
}

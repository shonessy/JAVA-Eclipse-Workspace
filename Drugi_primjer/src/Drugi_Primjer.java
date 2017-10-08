import java.util.Scanner;

public class Drugi_Primjer {
	public static void main(String[] args){
		int a,b;
		Scanner unos=new Scanner(System.in);
		
		System.out.print("Unesite a: ");
		a=unos.nextInt();
		System.out.print("Unesite b: ");
		b=unos.nextInt();
		
		System.out.printf("Zbir %d i %d je %d ", a, b, a+b);
		
		
	}

}

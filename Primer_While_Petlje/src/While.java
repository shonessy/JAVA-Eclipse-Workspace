import java.util.Scanner;

public class While {
	public static void main(String[] args){
		int broj, suma=0, brojUnosa=0;
		float aritSred, aritSredCast;
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Unesite brojeve, -1 prekida unos");
		broj=unos.nextInt();
		
		
		while(broj!=-1){
			brojUnosa++;
			suma+=broj;
			broj=unos.nextInt();
			}
		
		aritSred=suma/brojUnosa;
		aritSredCast=(float)suma/brojUnosa;
		
		System.out.printf("Uneseno je %d brojeva cija je suma %d\n", brojUnosa, suma);
		System.out.printf("Aritmeticja sredina: %.3f\n", aritSred);
		System.out.printf("Aritmeticja sredina(Cast): %.3f\n", aritSredCast);
		
	}

}

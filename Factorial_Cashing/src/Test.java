import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		long startTime, endTime;
		boolean repeat=true;
		
		while(repeat){
			System.out.print("\nUnesite broj za racunanje faktorijela: ");
			int n=unos.nextInt();
			
			startTime=System.currentTimeMillis();
			System.out.print("\nFakotrijal= " + FactorialCashing.faktorial(n));
			endTime=System.currentTimeMillis();
			System.out.println("\nVreme izvrsavanja je: " + (float)(endTime-startTime)/1000 + "s");
			
			System.out.print("Ponovo ? (1-Da	0-Ne): ");
			int c=unos.nextInt();
			if(c==1)
				repeat=true;
			else if(c==0)
				repeat=false;
			}
	}

}

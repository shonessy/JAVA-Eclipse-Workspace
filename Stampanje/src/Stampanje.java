import java.util.Scanner;
public class Stampanje {

	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		char repet='y';
		int poc, kraj;
		int niz1[]=new int[5000];
		int niz2[]=new int[5000];
		Scanner unos=new Scanner(System.in);
		
		while(repet=='y'){
		System.out.print("Unesite pocetnu stranu: ");
		poc=unos.nextInt();
		
		System.out.print("\nUnesite zadnju stranu: ");
		kraj=unos.nextInt();
		
		int i=0,j=0;
		int pocc=poc;
		while( (i<=kraj) || (j<=kraj) ){
			niz1[i]=pocc;
			i++;pocc++;
			niz1[i]=pocc;
			i++;pocc++;
			
			niz2[j]=pocc;
			j++;pocc++;
			niz2[j]=pocc;
			j++;pocc++;
			
			}
		
		int a=0;
		System.out.println();
		System.out.println("Prednja strana: ");
		for(int k=0;k<=(kraj-poc)/2;k++){
			if(niz1[k]>kraj)
				break;
			else{
				System.out.print(niz1[k] + ",");
				a++;
				}
			}		
		System.out.println("\nBroj listova: " + (float)a/2 );
		
		a=0;
		System.out.println("\nZadnja strana: ");
		for(int k=0;k<=(kraj-poc)/2;k++){
			if(niz2[k]>kraj)
				break;
			else{
				System.out.print(niz2[k] + ",");
				a++;
				}
			}
		System.out.println("\nBroj listova: " + (float)a/2 );
		
		System.out.println("\n\nPonovo: [y/n]");
		repet=unos.next().charAt(0);
		}
	}

}

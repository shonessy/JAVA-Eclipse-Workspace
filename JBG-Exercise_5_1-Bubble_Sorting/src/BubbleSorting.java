import java.util.Scanner;
public class BubbleSorting {
	public static void main(String[] args) {
	
		Scanner unos=new Scanner(System.in);
		int l;
		System.out.print("Unesite duzinu niza: ");
		l=unos.nextInt();
		int niz[]=new int[l];
		
		System.out.println("Unesite clanove niza: ");
		for(int i=0;i<l;i++){
			System.out.print( (i+1) + ". ");
			niz[i]=unos.nextInt();
			}
		System.out.println("\n");
		
		System.out.print("Vas niz je: ");
		for(int i=0;i<l;i++){
			System.out.print("  " + niz[i]);
			}
		System.out.println("\n");
		
		//sorting
		for(int i=1;i<l;i++){
			for(int j=l-1;j>=i;j--){
				if(niz[j-1]>niz[j]){
					int temp=niz[j-1];
					niz[j-1]=niz[j];
					niz[j]=temp;
					}
				}
			}
		
		System.out.print("Sortirani niz je: ");
		for(int i=0;i<l;i++){
			System.out.print("  " + niz[i]);
			}
	}
	
}

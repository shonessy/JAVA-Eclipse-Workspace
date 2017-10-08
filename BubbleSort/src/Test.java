import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		int n=0;
		Bubble b1;
		int niz[];
		System.out.print("Staticki podatak Bubble.a: " + Bubble.a + "\n");
		Bubble.a++;
		
		System.out.print("Unesite duzinu niza za sortiranje: ");
		n=unos.nextInt();
		niz=new int[n];
		
		System.out.print("Unesite clanove niza: ");
		for(int i=0; i<n; i++)
			niz[i]=unos.nextInt();
		b1=new Bubble(niz);
		System.out.print("\nStaticki podatak b1.a: " + b1.a + "\n");

		//b1.fill(niz);
		
		
		System.out.print("Uneseni niz je: \n");
		for(int i: niz)
			System.out.print(i + "\t");
		
		int sorted[]=b1.sort();
		System.out.print("\nSortirani niz je: \n");
		for(int i: sorted)
			System.out.print(i + "\t");
		
		System.out.print("\nUneseni niz je: \n");
		for(int i: niz)
			System.out.print(i + "\t");
		
		Bubble b2=new Bubble(sorted);
		
	}

}

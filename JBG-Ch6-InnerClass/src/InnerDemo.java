import java.util.Scanner;
public class InnerDemo {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		
		
		System.out.print("Unesite duzinu niza cjelobrojnih brojeva: ");
		int niz[]=new int[ unos.nextInt() ];
		IntArray arrayObj=new IntArray(niz);
		
		System.out.println("Unesite niz: ");
		for(int i=0;i<niz.length;i++){
			System.out.print( (i+1) + ". ");
			niz[i]=unos.nextInt();
			}
			
		System.out.println("\n");
		arrayObj.analizeArray();

	}

}

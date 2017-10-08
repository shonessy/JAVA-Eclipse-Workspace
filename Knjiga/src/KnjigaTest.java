import java.util.Scanner;

public class KnjigaTest {
	public static void main(String[] args){
		Scanner unos=new Scanner(System.in);
		
		Knjiga knjiga1=new Knjiga("Lavlje srce", 256);
		Knjiga knjiga2=new Knjiga("Zov divljine");
		Knjiga knjiga3=new Knjiga(128);
		Knjiga knjiga4=new Knjiga();
	
		/*System.out.printf("Podrazumevani podaci:\nIme knjige: %s\nBroj strana: %d", knjiga.getIme(), knjiga.getBrojStrana());
	
		System.out.print("\nUnesite ime knjige: ");
		knjiga.setIme(unos.nextLine());
	
		System.out.print("\nUnesite broj strana knjige: ");
		knjiga.setBrojStrana(unos.nextInt());
		System.out.println();
		knjiga.getKnjiga();*/
		
		knjiga1.getKnjiga();
		knjiga2.getKnjiga();
		knjiga3.getKnjiga();
		knjiga4.getKnjiga();
		
		System.out.printf("Broj kreiranih knjiga je: %d", Knjiga.getBrojKnjiga() );
		System.out.println();
	
	}
}

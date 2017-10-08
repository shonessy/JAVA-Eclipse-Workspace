import java.util.Scanner;

public class Bitwisw {
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite neki string koji sadrzi velika i mala slova: ");
		String s=unos.nextLine();
		System.out.println("\n");
		
		System.out.println("Sve u mala slova: ");
		for(int i=0;i<s.length();i++){
			if( s.charAt(i)>='A' && s.charAt(i)<='Z')
				System.out.print( (char) (s.charAt(i) | 0b00100000) );
			else
				System.out.print( s.charAt(i) );		
			}
		System.out.println("\n");
		
		System.out.println("Sve u velika slova: ");
		for(int i=0;i<s.length();i++){
			if( s.charAt(i)>='a' && s.charAt(i)<='z')
				System.out.print( (char) (s.charAt(i) & 0b11011111) );
			else
				System.out.print( s.charAt(i) );
			}
		
		
		
	}
}

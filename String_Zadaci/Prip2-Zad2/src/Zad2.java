import java.util.Scanner;
import java.lang.Character;;


public class Zad2 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite prvi string: ");
		String text1=unos.nextLine();
		System.out.print("\nUnesite drugi string: ");
		String text2=unos.nextLine();
		
		//String text3;
		for(int i=0;i<text1.length();i++){
			if( text1.charAt(i)>='0' && text1.charAt(i)<='9' ){
				text2+=Character.toString(text1.charAt(i));
				}
			}
		
		System.out.print("\nDobijeni string: " + text2);

	}

}

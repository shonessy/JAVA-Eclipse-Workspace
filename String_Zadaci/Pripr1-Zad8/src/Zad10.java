import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.print("Unesite broj: ");
		
		int br=unos.nextInt();
		
		System.out.println();
		System.out.println("Bin: " + Integer.toBinaryString(br));
		System.out.println("Oct: " + Integer.toOctalString(br));
		System.out.println("Hex: " + Integer.toHexString(br));

	}

}

import java.util.Scanner;

public class TestStringReversing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sIn;
		System.out.print("Unesite string: ");
		
		while(!(sIn=input.nextLine()).equals("")){
			System.out.println("Obrnuti string[noGen]: " + new Reverser().doRev(sIn));
			System.out.println("Obrnuti string[Gen]:   " + new Reverser().doRevWithGenericStack(sIn));
			System.out.println("------------------------------\n");
			System.out.print("Unesite string: ");
		}
		
		System.out.println("Exiting ....");
	}

}

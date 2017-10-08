import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Character;

public class Zad8 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		boolean brOk=false;
		String brStr;
		int brInt=0,sum=0;
		char brChr[]=null;
		
		try{
			System.out.print("Unesite broj: ");
			brInt=unos.nextInt();
			}
		catch(InputMismatchException e){
			System.out.println("\nNiste uneli pravilno broj, pokusajte ponovo");
			brOk=false;
			}
		
		// Strukturni pristup
		brStr=Integer.toString(brInt);
		brChr=brStr.toCharArray();
		int brNiz[]=new int[brChr.length];
		for(int i=0;i<brChr.length;i++){
			brNiz[i]=brChr[i]-'0';
			sum+=brNiz[i];
			}
		
		System.out.println("Suma je: " + sum);
		
		// Objektni pristup
		sum=0;
		for(int i=0;i<brStr.length();i++){
			if(Character.getNumericValue(brStr.charAt(i))>=0)
				sum+=Character.getNumericValue(brStr.charAt(i));
			}
		System.out.println("Suma je: " + sum);
		
	}

}

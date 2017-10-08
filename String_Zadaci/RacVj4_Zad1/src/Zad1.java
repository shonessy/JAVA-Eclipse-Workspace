import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite String: ");
		String text=unos.nextLine();
		
		// I nacin-komplikovaniji
		char textCh[]=text.toCharArray();
		for(int i=0;i<textCh.length;i++){
			if(textCh[i]>='a' && textCh[i]<='z')
				textCh[i]-='a'-'A';
			}
		String text1=new String(textCh);
		System.out.println("Prvi nacin: " + text1);
		
		
		// II nacin-jednostavniji
		String text2=text.toUpperCase();
		System.out.println("Drugi nacin: " + text2);
		

	}

}

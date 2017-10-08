import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;


public class Zad11 {
	public static void main(String[] args){
		Scanner unos=new Scanner(System.in);
		ArrayList<String> rle=new ArrayList<String>();
		
		System.out.print("Unesite text: ");
		String text=unos.nextLine();
		System.out.println();
		
		int brPon=1;
		for(int i=0;i<text.length();i++){
			if(i==text.length()-1){
				rle.add(Character.toString(text.charAt(i)));
				rle.add(Integer.toString(brPon));
				brPon=1;
				}
			else {
				if( text.charAt(i)==text.charAt(i+1))
					brPon++;
				else{
					rle.add(Character.toString(text.charAt(i)));
					rle.add(Integer.toString(brPon));
					brPon=1;
					}
				}
			}
		
		System.out.println(rle);
		
		}
		
}

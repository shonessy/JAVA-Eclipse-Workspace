import java.io.*;
import java.util.Scanner;

public class demo_class {

	public static void main (String[] args){
		int start_p, end_p;
		int[] a=new int[500];
		int[] b=new int[500];
		Scanner unos=new Scanner(System.in);
		
		System.out.print("Unesite pocetnu stranu: ");
		start_p=unos.nextInt();
		System.out.print("Unesite zadnju stranu: ");
		end_p=unos.nextInt();
		
		for(int i=start_p;i<=end_p;i++ ){
			a[i]=i;i++;
			a[i]=i;i++;
			b[i]=i;i++;
			b[i]=i;
		}
		
		System.out.print("\n\nPrednje strane : \n");
		for(int i=0;i<=end_p;i++){
			if(a[i]!=0){
				System.out.print(a[i]);
				System.out.print(",");
				}
			}
		
		System.out.print("\n\nZadnje strane : \n");
		for(int i=0;i<=end_p;i++){
			if(b[i]!=0){
				System.out.print(b[i]);
				System.out.print(",");
				}
			}
		System.out.print("\n\n");
		
	}
	
}

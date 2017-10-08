import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	private static int niz[];
	
	//-------------------------------------------//
	//constructor
	public Test(int n){
		niz=new int[n];
	}
	//-------------------------------------------//
	//fill niz
	public void fillNiz(int niz[]){
		this.niz=niz;
	}
	//-------------------------------------------//
	//niz to String
	public String niz2String(){
		String ret="\n\t";
		for(int x : niz)
			ret+=String.valueOf(x) + "  ";
		return ret;
	}
	//-------------------------------------------//
	//recursive binary search
	public int recBinSrch(int downL, int uppL, int key) {
		if(downL>uppL)
			return -1;							//not found
		int midlIndex=(downL + uppL)/2;
		if(niz[midlIndex]==key)
			return midlIndex;
		else if(niz[midlIndex]>key)
			return recBinSrch(downL, midlIndex-1, key);
		else
			return recBinSrch(midlIndex+1, uppL, key);
			
	}
	//-------------------------------------------//
	//find
	public int find(int key) {
		return recBinSrch(0, this.niz.length, key);
	}	
	//-------------------------------------------//
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Test t=new Test(10);
		for(int i=0; i<niz.length; i++)
			niz[i]=(int)(Math.random()*100);
		System.out.println("Niz: " + t.niz2String());
		Arrays.sort(niz);
		System.out.println("Sortirani Niz: " + t.niz2String());
		
		int n;
		System.out.print("Unesite broj za pretragu: ");
		n=input.nextInt();
		System.out.printf("Broj %d se nalazi na poziciji: %d", n, t.find(n));

	}

}

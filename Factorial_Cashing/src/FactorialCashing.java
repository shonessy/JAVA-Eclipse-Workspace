import java.util.Scanner;

public class FactorialCashing {
	static int current=0;
	static long tabela[]=new long[21];
	static{
		tabela[current]=1;	// 0!=1
		current++;
		}
	
	/*public static void main(String[] args){
		Scanner unos=new Scanner(System.in);
		System.out.print("Unesite broj za racunanje faktorijela: ");
		int n=unos.nextInt();
		System.out.print("\nFakotrijal= " + faktorial(n));
	}*/
	
	public static long faktorial(int x) throws IllegalArgumentException {
		if(x>=tabela.length) 
			throw new IllegalArgumentException("Owerflow: x>20");
		else if(x<0)
			throw new IllegalArgumentException("Ne moze negativan broj");
		
		if(tabela[x]!=0) return tabela[x];
		else{
			while(current<=x){
				tabela[current]=current*tabela[current-1];
				current++;
				}
			return tabela[x];
			}
		}
}

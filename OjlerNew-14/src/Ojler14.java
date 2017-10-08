import java.math.BigInteger;

public class Ojler14 {
	
	private static final int LIMIT=1_000_000;
	private static long lengthS[] = new long[LIMIT];
	static{
		lengthS[0]=0;
		lengthS[1]=1;
	}
	
	
	public static void main(String[] args) {
		
		int chainLength=1;
		int chainLengthMax=1;
		int numMax=1;
		for(int i=1;i<LIMIT;i++){
			long n=(long)i;
			chainLength=1;
			System.out.print(i + ".  ");
			while(n!=1){
				n=(n%2==0) ? n>>>1 : 3*n+1; 
				if(n<LIMIT && lengthS[(int)n]!=0){				//ako smo ga vec izracunali
					chainLength+=lengthS[(int)n];
					//System.out.print(n + " -> ");
					break;
				}
				else
					chainLength++;
				//System.out.print(n + "  ");
			}//while
			lengthS[i]=chainLength;
			System.out.println("\tDuzina: " + chainLength + "\n");
			if(chainLength>chainLengthMax){
				chainLengthMax=chainLength;
				numMax=i;
			}
		}//for
		System.out.println("\n MaxBR: " + numMax + "\t chainLength: " + chainLengthMax);
}
	
}
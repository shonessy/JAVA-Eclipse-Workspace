
public class VampireNumber {
	public static void main(String[] args) {

		int n[]=new int[4];
		for(int i=1001; i<10_000; i++){
			n=numToDig(i);
			int a=n[0],
				b=n[1],
				c=n[2],
				d=n[3];
			
			if	   (dig2ToNum(a, b)*dig2ToNum(c, d)==i)	System.out.println(i);
			else if(dig2ToNum(a, b)*dig2ToNum(d, c)==i)	System.out.println(i);
			else if(dig2ToNum(b, a)*dig2ToNum(c, d)==i)	System.out.println(i);
			else if(dig2ToNum(b, a)*dig2ToNum(d, c)==i)	System.out.println(i);
			
			else if(dig2ToNum(a, c)*dig2ToNum(b, d)==i)	System.out.println(i);
			else if(dig2ToNum(a, c)*dig2ToNum(d, b)==i)	System.out.println(i);
			else if(dig2ToNum(c, a)*dig2ToNum(b, d)==i)	System.out.println(i);
			else if(dig2ToNum(c, a)*dig2ToNum(d, b)==i)	System.out.println(i);
			
			else if(dig2ToNum(b, c)*dig2ToNum(a, d)==i)	System.out.println(i);
			else if(dig2ToNum(b, c)*dig2ToNum(d, a)==i)	System.out.println(i);
			else if(dig2ToNum(c, b)*dig2ToNum(a, d)==i)	System.out.println(i);
			else if(dig2ToNum(c, b)*dig2ToNum(d, a)==i)	System.out.println(i);

		}
		
		
	}
	
	//numer to digits
	static int[] numToDig(int n){
		int i=0;
		int ret[]=new int [4];
		while(n!=0){
			ret[i]=n%10;
			i++;
			n/=10;
		}
		int ret1[]=new int[4];
		for(int k=0,j=3; k<4; k++, j--)
			ret1[k]=ret[j];
		return ret1;
	}
	
	//2 digits to number
	static int dig2ToNum(int a, int b){
		return a*10+b;
	}
}

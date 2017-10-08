import java.math.BigInteger;

public class Ojler25 {
	public static final int LIMIT=1000;
	
	public static void main(String[] args) {
		BigInteger p2=BigInteger.ONE;	// pred-predhodni Fn-2
		BigInteger p1=BigInteger.ONE;	// predhodni 	  Fn-1	
		BigInteger p=BigInteger.ONE;	// trenutni 	  Fn
		
		long index=2L;
		
		while(p.toString().length()<LIMIT){
			p2=p1;
			p1=p;
			p=p1.add(p2);
			index++;
			//System.out.println(index + ". " + "p2: " + p2 + "\t p1: " + p1 + "\t p: " + p );	
		}
		System.out.println(index + ". " + p );

	}

}

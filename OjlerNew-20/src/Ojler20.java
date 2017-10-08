import java.math.BigInteger;

public class Ojler20 {
	public static final int N=100;
	
	public static void main(String[] args) {

		System.out.println(N + "! = " + new Ojler20().run() );
	}
	
	//run() method
	int run(){
		Ojler20 o20=new Ojler20();
		return o20.sumOfDigits(o20.fact(BigInteger.valueOf(N)));
	}
	
	//fact() method
	BigInteger fact(BigInteger n){
		if(n.equals(BigInteger.ONE))
			return n;
		return n.multiply(fact(n.subtract(BigInteger.ONE)));
	}
	
	//sumOfDigits() method
	int sumOfDigits(BigInteger n){
		int sum=0;
		String factS=n.toString();
		for(int i=0;i<factS.length(); i++)
			sum+=factS.charAt(i)- '0';
		return sum;
	}

}

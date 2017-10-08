import java.math.BigInteger;

public class Ojler16 {
	private static final int exp=1000;
	
	public static void main(String[] args) {
		String s[]=new Ojler16().run();
		System.out.println("2^" + exp + "= " + s[0]);
		System.out.println("Ukupno cifara: " + s[0].length());
		System.out.println("Zbir cifara: " + s[1]);
	}
	
	//run method
	public String[] run(){
		String ret[]=new String[2];
		int sum=0;
		String num=BigInteger.ONE.shiftLeft(exp).toString();
		ret[0]=num;
		for(int i=0;i<num.length();i++)
			sum+=num.charAt(i)-'0';
		ret[1]=Integer.toString(sum);
		return ret;
	}

}

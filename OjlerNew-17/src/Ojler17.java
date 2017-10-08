
public class Ojler17 {
	
	private static String[] ONES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};  // Requires 0 <= n <= 9
	private static String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static String[] TENS = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	public static void main(String[] args) {
		//System.out.println("Ukupno slova: " + new Ojler17().run());
		System.out.println("Ukupno slova: " + new Ojler17().runAndPrint());
		
	}
	
	//run() method
	int run(){
		int sum=0;
		for(int i=1;i<=1000;i++)
			sum+=countLetters(num2Txt(i) );
		return sum;
	}
	
	//runAndPrint() method
		int runAndPrint(){
			int sum=0;
			String s;
			for(int i=1;i<=1000;i++){
				System.out.println( i + ".  " + (s=num2Txt(i)) );
				sum+=countLetters(s);
			}
			System.out.println();
			return sum;
		}
	
	//num2Txt() method
	String num2Txt(int n){
		if(n<100)
			return num2Txt_0_99(n);
		else
			return num2Txt_100_1000(n);
	}
	
	//countLetters method - don't include space and -
	int countLetters(String s){
		int sum=0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)!=' ' && s.charAt(i)!='-')
				sum++;
		return sum;
	}
	
	//num2Txt_0_99 method
	String num2Txt_0_99(int n){
		if(n<10)
			return ONES[n];
		else if(n<20)
			return TEENS[n-10];
		else if(n<100)
			return  TENS[n/10-2] + "-" + ( (n%10!=0) ? ONES[n%10] : "" ) ;
		else
			return "";	//mora else default jer se moze desti da nijedan uslov nije zadovoljen pa fun ne vraca vrednost
	}
	
	//num2Txt_100_1000 method
	String num2Txt_100_1000(int n){
		if(n==1000)
			return "one thousand";
		else if(n>=100 && n<=999){
			if(n%100==0)
				return ONES[n/100] + " hundred";
			else
				return ONES[n/100] + " hundred and " + num2Txt_0_99(n%100);
		}
		else
			return "";
	}
}

	
	
	
	
	
	
	
	
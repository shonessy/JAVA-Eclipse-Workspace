
public class Ojler23 {
	public static final int LIMIT=28_123;
	boolean abundedTF[]=new boolean[LIMIT+1];
	
	public static void main(String[] args) {
		
		System.out.println(new Ojler23().run() );
		
	}
	
	//run() method
	int run(){
		Ojler23 o23 = new Ojler23();
		
		for(int i=0; i<=LIMIT; i++)
			if(o23.isAbunded(i))
				o23.abundedTF[i]=true;
				
		int sum=0;
		for(int i=1; i<=LIMIT; i++)
			if(! o23.isSumOfAbunded(i) )
					sum+=i;
		return sum;
	}
	
	//isAbunded() method
	boolean isAbunded(int n){
		int sum=0;
		for(int i=1; i<=n/2; i++)
			if(n%i==0)
				sum+=i;
		if(sum>n)
			return true;
		return false;
		//return sum;
	}
	
	//isSumOfAbunded() method
	boolean isSumOfAbunded(int n){
		for(int i=0; i<=n; i++)
			if(abundedTF[i] && abundedTF[n-i])
				return true;
		return false;
	}
}

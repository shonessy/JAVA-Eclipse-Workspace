
public class Ojler10 {

	public static void main(String[] args) {
		int MAX=2000000;
		boolean primes[]=new boolean[MAX+1];
		for(int i=2;i<primes.length;i++)	// 0 i 1 nisu prosti
			primes[i]=true;

		int n=(int)Math.ceil(Math.sqrt(MAX));
		for(int i=2;i<=n;i++){
			if(primes[i]){
				for(int j=2*i;j<primes.length;j+=i)
					primes[j]=false;
				}
			}
		long sum=0;
		for(int i=0;i<primes.length;i++){
			if(primes[i]){
				sum+=i;
				//System.out.print(i + ", ");
				}
			}
		System.out.println("Sum= " + sum);
		
		
		
	}

}

import java.util.ArrayList;

public class Ojler7_b {

	public static void main(String[] args) {
		ArrayList<Long> primeList = new ArrayList<Long>();
		int numOfPrimes=1;
		long prime=2;
		primeList.add(prime);
		System.out.println(numOfPrimes+"i je "+prime);
		
		boolean isPrime;
		long k=3;
		
		long n;
		long start=System.nanoTime();
		while(numOfPrimes<10001){
			isPrime=true;
			n=(long)Math.ceil(Math.sqrt(k));
			if(n>=primeList.size()){
				for(int i=0;i<primeList.size();i++){
					if(k%primeList.get(i)==0){
						isPrime=false;
						break;
						}
					}//for
				}
			else{
				for(int i=0;i<=n;i++){
					if(k%primeList.get(i)==0){
						isPrime=false;
						break;
						}
					}//for
				}
			if(isPrime){
				prime=k;
				numOfPrimes++;
				primeList.add(prime);
				//System.out.println(numOfPrimes+"i je "+prime);
				}
			k++;
			}
		long stop=System.nanoTime();
		System.out.println(numOfPrimes+"i je "+prime);
		System.out.println("Izracunato za: " + (stop-start)/1000000 + "ms");
		
		
		
	}

}


public class Ojler7 {

	public static void main(String[] args) {
		int numOfPrimes=1;
		long prime=2;
		boolean isPrime;
		long k=3;
		System.out.println(numOfPrimes+"i je "+prime);
		long start=System.nanoTime();
		long n;
		while(numOfPrimes<10001){
			isPrime=true;
			if(k>5){
				n=(long)Math.ceil(Math.sqrt(k));
				for(long i=2;i<=n;i++){
					if(k%i==0){
						isPrime=false;
						break;
						}
					}//for
				}
			else{
				for(long i=2;i<k;i++){
					if(k%i==0){
						isPrime=false;
						break;
						}
					}//for
				}
				if(isPrime){
					prime=k;
					numOfPrimes++;
					//System.out.println(numOfPrimes+"i je "+prime);
					}
			k++;
			}//w
		long stop=System.nanoTime();
		System.out.println(numOfPrimes+"i je "+prime);
		System.out.println("Izracunato za: " + (stop-start)/1000000 + "ms");
		
	}

}

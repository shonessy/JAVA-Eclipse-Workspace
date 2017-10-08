
public class Ojler21 {
	static final int LIMIT=10_000;
	public static void main(String[] args) {
		 
		
		
		System.out.println("Suma je " + new Ojler21().run() );

	}

	//run() method
	int run(){
		int sum=0;
		for(int i=2;i<LIMIT; i++){
			int s=new Ojler21().sumOfDividers(i);
			if( i != s && i==new Ojler21().sumOfDividers(s)){		// postoje brojevi koji su jednaki 
																							//sumi svojih djelilaca: 28=1+2+4+7+14
				sum+=i;
				System.out.println(i + ". sum= " + s );
			}
		}//for
		System.out.println("----------------------");
		return sum;
}

	//sumOfDividers();
	int sumOfDividers(int n){
		int s=0;
		for(int i=1;i<n;i++)
			if(n%i==0)
				s+=i;
		return s;
	}
}

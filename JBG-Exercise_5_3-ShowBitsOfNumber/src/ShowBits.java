
public class ShowBits {
	int numBits;
	
	ShowBits(int n){
		numBits=n;
		}

	void show(long number){
		long mask=1;
		mask<<=numBits-1;
		byte space=0;
		
		while(mask!=0){
			if( (number & mask) !=0 )
				System.out.print("1");
			else
				System.out.print("0");
			space++;
			if( (space%8)==0)
				System.out.print("  ");
			mask>>>=1;
			}
	
		System.out.println("\n");
		
		
		}	
	
}

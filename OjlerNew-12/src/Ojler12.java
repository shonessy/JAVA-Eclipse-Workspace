
public class Ojler12 {

	public static void main(String[] args) {
		long trNum=0;
		long ind=0;
		L1: {
			for(long i=1l; ;i++){
				trNum+=i;
				ind=0;
				System.out.print(i + ". " + trNum + "\t Divisors: ");
				int end=(int) Math.sqrt(trNum);
				for(long j=1l;j<=end;j++)
					if(trNum%j==0){
						//System.out.print(j + ", ");
						ind+=2;
						if(ind>500){
							System.out.println(ind + "\n");	
							break L1;
							}
						}
				if(trNum==end*end)
					ind++;
				System.out.println(ind + "\n");		
				}//for
		}//L1
		System.out.println("\n Trazeni broj je: " + trNum);
		
			

	}

}

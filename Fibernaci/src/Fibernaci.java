//racunanje prvih 20 Fibornacijevih brojeva
// fib=pred1+pred2	1,1,2,3,5,8,13

public class Fibernaci {	
	public static void main(String[] args){
		int pr2=1,pr1=1, brFib=2;
		System.out.printf("1.%d\n2.%d\n",pr2,pr1);
		
		////////////////	MOJ KOD
		/*int i=2;
		while(brFib<1000){
			if(i==pr1+pr2){
				pr2=pr1;
				pr1=i;
				//brFib++;
				System.out.printf("%d.%d\n", ++brFib, i);
				}
			i++;
			}*/
		///////////////		MOJ KOD
				
		
		//////////////		OPTIMIZOVANI KOD
		int fibSad=0,k=0;
		for(int j=0;j<18;j++){
			fibSad=pr1+pr2;
			pr2=pr1;
			pr1=fibSad;
			System.out.printf("%d.%d\n", j+3, fibSad);
			}
		//////////////OPTIMIZOVANI KOD
		
	}

}

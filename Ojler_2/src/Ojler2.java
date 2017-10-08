public class Ojler2 {	
	public static void main(String[] args){
		int fibPr2=1,fibPr1=2, fibSad=0, brFib=2, sumPar=2;
		System.out.printf("1.%d\n2.%d\n",fibPr2,fibPr1);
		
		
		int i=3;
		while(fibSad<4000000){
			fibSad=fibPr1+fibPr2;
			if(fibSad>=4000000)break;	//osiguranje, jer je 33=5702887
			fibPr2=fibPr1;
			fibPr1=fibSad;
			System.out.printf("%d.%d\n", i++, fibSad);
			if(fibSad%2==0)
				sumPar+=fibSad;
			}
		
		System.out.printf("Suma parnih je: %d", sumPar);
	}

}

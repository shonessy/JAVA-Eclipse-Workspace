
public class Ojler1 {

	public static void main(String[] args) {
		long sum=0;
		long GRANICA=40;
		long startTime, endTime;
		
		/*
		startTime=System.currentTimeMillis();	// na Granica=4 000 000 vreme izvrsavanja je 47.119s 
		for(long i=1;i<GRANICA;i++){
			if( (i%3==0) || (i%5==0) ){
				sum+=i;
				System.out.println(i);
				}
			}
		endTime=System.currentTimeMillis();
		
		System.out.println("\nSuma je: " + sum);
		System.out.println("Vreme izvrsavanja je: " + (float)(endTime-startTime)/1000 + "s");
		*/
		
		
		
		
		//////// OPTIMIZOVANI KOD
		///*
		System.out.println("-----------------------------------");
		long i=1,sumOpt=0;
		startTime=System.currentTimeMillis();	//na Granica=4 000 000 vreme izvrsavanja je 38.893s
		while((i*3)<GRANICA){
			sumOpt+=(i*3);
			System.out.print(i*3);
			if( ((i*5)<GRANICA) & (i%3!=0) ){
				sumOpt+=(i*5);
				System.out.print("\t" + (i*5));
				}
			i++;
			System.out.println();
			}
		endTime=System.currentTimeMillis();
			
		System.out.println("\nSuma je: " + sumOpt);
		System.out.println("Vreme izvrsavanja je: " + (float)(endTime-startTime)/1000 + "s");
		System.out.println("Ispitano brojeva: " + i);
		//*/
	}

}

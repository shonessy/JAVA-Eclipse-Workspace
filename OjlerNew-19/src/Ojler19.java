
public class Ojler19 {

	public static void main(String[] args) {
		
		System.out.println("Broj nedelja koje padaju prvog u mjesecu od 1901 do 2000: " + 
									new Ojler19().run() );
	}
	
	// run method
	int run(){
		int numSun=0;
		for(int i=1901; i<=2000; i++)
			for(int j=1; j<=12; j++)
				if( (new Year(i).getFirstDayOfMonth(j) )==7)
					numSun++;
		return numSun;
				
	}
	
}

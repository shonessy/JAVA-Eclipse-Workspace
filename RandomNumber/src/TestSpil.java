
public class TestSpil {
	public static void main(String[] Args){
		
		Spil spil=new Spil();
		
		for(int i=0;i<spil.BROJ_KARATA;i++){
			if(i%4==0)
				System.out.println();
			System.out.printf("%12s", spil.deli_s());
			
			}
		
		System.out.println("\n---------PROMESANE--------");
		
		spil.mesaj();
		for(int i=0;i<spil.BROJ_KARATA;i++){
			if(i%4==0)
				System.out.println();
			System.out.printf("%12s", spil.deli_s());
			
			}
	
	}

}

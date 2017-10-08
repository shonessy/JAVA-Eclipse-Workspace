
public class Test {
	public static void main(String args[]){
		int niz[]=new int[5];
		String s="Kako si";
		
		System.out.println("Prije try: \n");
		try{
			System.out.println("Normalan try");
			niz[2]=5;
			System.out.println(niz[2]);
			System.out.println("Uspjesna dodjela vrednosti");
		}catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Ovo se nece odstampati");
			System.out.println();
		}finally{
			System.out.println("Izasli smo uspjesno iz try-a");
			System.out.println();
		}
		
		try{
			System.out.println("Greska u nizu:");
			niz[12]=5;
			System.out.println(niz[12]);
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException exc){
			System.out.println("Niz van granica");
		}finally {
			System.out.println("Izasli smo iz try-a sa greskom");
			System.out.println();
		}
		
		try{
			System.out.println("Greska u Stringu");
			System.out.println(s.charAt(18));
			System.out.println();
		}catch(StringIndexOutOfBoundsException exc){
			System.out.println("String van granica");
			System.out.println();
		}
		
		/*
		 * Iz metode
		 */
		System.out.println("Exceptions iz klase1:");
		Exce1.func(1);
		Exce1.func(7);
		try {
			Exce1.func(15);
		} catch (ArrayIndexOutOfBoundsException exc) {
			// TODO: handle exception
			System.out.println("Uhvacen u main");
		}
		
		System.out.println("\nExceptions iz klase2:");
		Exce2.fun(3);
		//Exce2.fun(84);
		try{
			Exce2.fun(84);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Uhvacen u main-u");
		}
		
		System.out.println("\nDeljenje sa nulom:");
		try {
			int x=27/8;
			x=x/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error-Deljenje sa nulom");
		}
		
	}//main
	
}

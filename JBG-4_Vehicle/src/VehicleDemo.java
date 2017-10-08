import java.util.Scanner;

public class VehicleDemo {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		
		
		
		System.out.print("Unesite broj putnika za kombi: ");
		int p= unos.nextInt();
		System.out.print("Unesite kapacitet rezervoara za kombi[l]: ");
		int r= unos.nextInt();
		System.out.print("Unesite potrosnju za kombi[l/100km]: ");
		int po= unos.nextInt();
		Vehicle minivan = new Vehicle(p,r,po);
	
		System.out.print("\nUnesite broj putnika za sportski automobil: ");
		p= unos.nextInt();
		System.out.print("Unesite kapacitet rezervoara za sportski automobil[l]: ");
		r= unos.nextInt();
		System.out.print("Unesite potrosnju za sportski automobil[l/100km]: ");
		po= unos.nextInt();
		Vehicle sportsCar = new Vehicle(p, r, po);
		System.out.println("\n");
		
		System.out.println("Sa punim rezervoarom kombi moze da predje: " 
												+ minivan.range() + " km");
		System.out.println("Sa punim rezervoarom sportski automobil moze da predje: " 
												+ sportsCar.range() + " km");
		System.out.println("\n");
		
		
		System.out.print("Unesite koliki put zelite da predjete sa kombijem[km]: ");
		System.out.println("Potrebno vam je: " + minivan.fuelNeeded(unos.nextInt()) 
											   + " l goriva" );
		
		System.out.print("\nUnesite koliki put zelite da predjete sa sportskim automobilom[km]: ");
		System.out.println("Potrebno vam je: " + sportsCar.fuelNeeded(unos.nextInt()) 
											   + " l goriva" );
				
	}

}

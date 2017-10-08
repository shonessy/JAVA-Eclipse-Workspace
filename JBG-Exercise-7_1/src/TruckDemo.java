import java.util.Scanner;

public class TruckDemo {

	public static void main(String[] args) {
		Truck t1=new Truck(2, 200, 35, 18000);
		Truck t2=new Truck(3, 150, 25, 8000);
		Truck t3=new Truck(t2);
		
		Scanner unos=new Scanner(System.in);
		
		System.out.println("Kamion 1: ");
		System.out.print("Putnici: " + t1.getPassengers() + 
						   "\tRezervoar: " + t1.getFuelCap() + " L" + 
						   "\tPotrosnja: " + t1.getConsumption() + "L/100km" + 
						   "\tRadijus: " );
		System.out.printf("%.2f km \n\n", t1.range());
		
		System.out.println("Kamion 2: ");
		System.out.print("Putnici: " + t2.getPassengers() + 
						   "\tRezervoar: " + t2.getFuelCap() + " L" + 
						   "\tPotrosnja: " + t2.getConsumption() + "L/100km" + 
						   "\tRadijus: ");
		System.out.printf("%.2f km \n\n", t2.range());
		
		System.out.println("Kamion 3: ");
		System.out.print("Putnici: " + t3.getPassengers() + 
						   "\tRezervoar: " + t3.getFuelCap() + " L" + 
						   "\tPotrosnja: " + t3.getConsumption() + "L/100km" +
						   "\tRadijus: ");
		System.out.printf("%.2f km \n\n", t3.range());
		
		int a;
		System.out.print("Unesite koliko km zelite da predjete sa kamionom: ");
		System.out.println("Za to vam je potrebno: \n" + 
						   "Sa prvim kamionom: " +  t1.fuelNeeded(a=unos.nextInt()) + "L\n" + 
						   "Sa drugim kamionom: " + t2.fuelNeeded(a) + "L\n" + 
						   "Sa trecim kamionom: "+  t3.fuelNeeded(a) + "L");
		
	}

}

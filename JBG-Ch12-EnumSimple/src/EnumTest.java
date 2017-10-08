import java.util.Scanner;

public class EnumTest {
	public static void main(String[] args) {
		EnumTest et=new EnumTest();
		Transport tr;
		Scanner input=new Scanner(System.in);
		
		tr=Transport.AIRPLANE;
		System.out.println("Vrednost promj. tr: " + tr);
		tr=Transport.BOAT;
		if(tr==Transport.BOAT)
			System.out.println("Jeste brod");
		et.description(tr);

		System.out.println("Unsite neku od vrednosti enumeracije: ");
		//Transport allTransports[]=Transport.values();
		for(Transport x: Transport.values())
			System.out.print(x + "\t");
		System.out.println();
		boolean failInput=true;
		while(failInput)
			try{
				tr=Transport.valueOf(input.nextLine());
				et.description(tr);
				failInput=false;
			}catch(IllegalArgumentException e){
				System.out.print("Neispravan unos, pokusajte ponovo: ");
			}
		
		
	}
	
	public void description(Transport tr){
		switch(tr){
		case CAR:
			System.out.println("A car carries people");
			break;
		case TRUCK:
			System.out.println("A truck carries goods");
			break;
		case AIRPLANE:
			System.out.println("An airplane flies");
			break;
		case TRAIN:
			System.out.println("A train runs on rails");
			break;
		case BOAT:
			System.out.println("A boat sails on water");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}


public class EnumConstrTest {

	public static void main(String[] args) {

		Transport tr;
		tr=Transport.AIRPLANE;
	
		System.out.println("Avion tipicna: " + tr.getTypSpeed());
		System.out.println("Avion maximalna: " + tr.getMaxSpeed());
		System.out.println(tr);
		
		System.out.println("\nTipicne i maksimalne brzine svih: ");
		for(Transport x: Transport.values())
			System.out.println(x);
		
		//ordinal values
		System.out.print("Ordinalan vrednost BOAT: ");
		System.out.println(Transport.BOAT.ordinal());
		System.out.println(Transport.CAR.compareTo(Transport.TRAIN));
		
		System.out.println();
		System.out.print("Proba 1");
		System.out.print("\b\b\b\b\b\b\b");
		System.out.print("Proba 2");
	}

}

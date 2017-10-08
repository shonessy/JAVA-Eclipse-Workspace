import java.util.Scanner;

public class CharacterDemo {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Character character = new King();
		
		while(true){
			System.out.println("Izaberite karaktera za borbu: ");
			System.out.println("Kralj [1] \t Kraljica [2]");
			int a = keyboard.nextInt();
			switch (a){
			case 1:
				character = new King();
				break;
			
			case 2:
				character = new Queen();
				break;
			}
			
			System.out.println();
			character.fight();
			System.out.println();
			
			System.out.println("Projena Oruzja[1] Projena Karaktera[2] Kraj igre[0] ");
			a = keyboard.nextInt();
			switch (a){
			case 0:
				System.out.println("Hvala na igranju...");
				keyboard.close();
				break;
			case 1:
				System.out.println("Izaberite oruzje za borbu: ");
				System.out.println("Mac [1] \t Noz [2] \t Luk i strijela [3] \t Sjekira [4]");
				int b=keyboard.nextInt();
				switch (b){
				case 1:
					character.setWeapon(new Sword());
					break;
				case 2:
					character.setWeapon(new Knife());
					break;
				case 3:
					character.setWeapon(new BowAndArrow());
					break;
				case 4:
					character.setWeapon(new Axe());
					break;
				}	
				
				System.out.println();
				character.fight();
				System.out.println();
				break;
			case 2:
				break;
			}
			
			System.out.println();
			System.out.println();			
		}//end while			
	}	
}

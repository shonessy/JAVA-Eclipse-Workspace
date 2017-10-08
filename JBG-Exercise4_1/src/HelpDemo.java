import java.util.Scanner;

public class HelpDemo {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in); 
		Help helpObj=new Help();
		char input;
		
		while(true){
			helpObj.showMenu();
			while(! helpObj.isInputValid(input=unos.next().charAt(0)) )
				System.out.println("Neispravan unos");
			
			if(input=='q'){
				System.out.println("HELP END");
				break;
				}
			
			System.out.println("\n---------------------------");
			helpObj.helpOf(input);
			System.out.println("---------------------------\n");
			
		}

	}

}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTest {
	public static void main(String[] args){
		int numberOfGuesses=0;
		Random randObj=new Random();
		Scanner unos=new Scanner(System.in);
	
		SimpleDotCom game=new SimpleDotCom();
		int rand=randObj.nextInt(4);
		ArrayList<String> locations= new ArrayList<String>();
		locations.add(Integer.toString(rand));
		locations.add(Integer.toString(rand+1));
		locations.add(Integer.toString(rand+2));
		game.setLocationCells(locations);
	
		boolean isAlive=true;
		while(isAlive){
			System.out.print("Unesite broj[0-6]: ");
			String guess=unos.nextLine();
			numberOfGuesses++;
			String result=game.checkYourGuess(guess);
			if(result.equals("Kill")){
				System.out.println("Broj pokusaja: " + numberOfGuesses);
				isAlive=false;
				}
		
			}
		}
}

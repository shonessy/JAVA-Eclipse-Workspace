import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTest {
	public static void main(String[] args){
		int numberOfGuesses=0;
		Random randObj=new Random();
		Scanner unos=new Scanner(System.in);
	
		SimpleDotCom game=new SimpleDotCom();
		int rand=randObj.nextInt(4);
		int locations[]={rand,rand+1,rand+2};
		game.setLocationCells(locations);
	
		boolean isAlive=true;
		while(isAlive){
			System.out.print("Unesite broj: ");
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

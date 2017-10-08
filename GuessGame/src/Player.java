import java.util.Random;;

public class Player {
	public int guessedNumber;
	private Random randObj=new Random();
	
	public void guessNumber(){
		guessedNumber=randObj.nextInt(10);
		}

}

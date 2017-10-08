import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class DotComBust {
	private ArrayList<DotCom> dotComList= new ArrayList<DotCom>();
	private int numOfGuesses=0;
	private Scanner unos=new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		DotComBust game=new DotComBust();
		game.setUpGame();
		game.startPlaying();

		}
	
	public static ArrayList<String> placeDotCom(){
		ArrayList<String> locations= new ArrayList<String>();
		Random randObj=new Random();
		String imeVrste[]={"A", "B", "C", "D", "E", "F", "G"};
		int horVer=randObj.nextInt(10);	//hor-0	ver-1
		
		if(horVer<=5){		//horizontalno
			System.out.println("Horizontalno");
			randObj=new Random();
			int randVrsta=randObj.nextInt(6);
			String vrsta=imeVrste[randVrsta];
			
			randObj=new Random();
			int randKolona=randObj.nextInt(4);
			
			locations.add(vrsta + Integer.toString(randKolona));
			locations.add(vrsta + Integer.toString(randKolona+1));
			locations.add(vrsta + Integer.toString(randKolona+2));
			}
		
		else{			//vertikalno
			System.out.println("Vertikalno");
			randObj=new Random();
			int randKolona=randObj.nextInt(6);
			String kolona=Integer.toString(randKolona);
			
			randObj=new Random();
			int randVrsta=randObj.nextInt(4);
			
			locations.add(imeVrste[randVrsta] + kolona);
			locations.add(imeVrste[randVrsta+1] + kolona);
			locations.add(imeVrste[randVrsta+2] + kolona);
			}
		return locations;
		}
	
	public void setUpGame(){
		System.out.println("Cilj potopiti 3 broda u sto manje pokusaja");
		
		DotCom one=new DotCom();
		one.setName("Ana");
		//one.setLocationCells(placeDotCom());
		dotComList.add(one);
		
		DotCom two=new DotCom();
		two.setName("Maja");
		//two.setLocationCells(placeDotCom());
		dotComList.add(two);
		
		DotCom three=new DotCom();
		three.setName("Urke");
		//three.setLocationCells(placeDotCom());
		dotComList.add(three);
	
		System.out.println("Imena Brodova su: " + one.getName() + "\t" + two.getName() + "\t" + three.getName());
		
		for(int i=0;i<dotComList.size();i++)
			(dotComList.get(i)).setLocationCells(placeDotCom());

		}
	
	public void startPlaying(){
		while(!dotComList.isEmpty()){
			System.out.print("Unesite broj[0-6]: ");
			String guess=unos.nextLine();
			numOfGuesses++;
			checkGuess(guess);
			}
		System.out.println("Trebalo vam je: " + numOfGuesses + " pokusaja");
		}
	
	public void checkGuess(String guess){
		String result="Miss";
		for(int i=0;i<dotComList.size();i++){
			result=(dotComList.get(i)).checkYourGuess(guess);
			if(result.equals("Hit"))
				break;
			if(result.equals("Kill")){
				dotComList.remove(i);
				System.out.println("You sunk " + (dotComList.get(i)).getName());
				break;
				}
			}
		System.out.println(result);
		}
	

}

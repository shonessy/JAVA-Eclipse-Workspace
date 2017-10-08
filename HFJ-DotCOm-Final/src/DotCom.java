import java.util.ArrayList;


public class DotCom {
	private ArrayList<String> locationCells = new ArrayList<String>();
	private String name;
	
	public void setName(String a){
		name=a;
		}
	public String getName(){
		return name;
		}
	
	public void setLocationCells(ArrayList<String> loc){
		locationCells=loc;
		}
	
	public String checkYourGuess(String guess){
		String result = "Miss";
		int index=locationCells.indexOf(guess);
		if(index>=0){
			locationCells.remove(index);
			if(locationCells.isEmpty())
				result="Kill";
			else
				result="Hit";
			}
		return result;
		
		}
	
}

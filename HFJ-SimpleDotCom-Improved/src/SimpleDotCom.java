import java.util.ArrayList;


public class SimpleDotCom {
	private ArrayList<String> locationCells=new ArrayList<String>();
	//private int numOfHits=0;
	
	public void setLocationCells(ArrayList<String> a){
		locationCells=a;
		}
	
	public String checkYourGuess(String a){
		String result="Miss";
		int index=locationCells.indexOf(a);
		if(index>=0){
			locationCells.remove(index);
			if(locationCells.isEmpty())
				result="Kill";
			else 
				result="Hit";				
			}
		
		
		System.out.println(result);
		return result;
		}
}

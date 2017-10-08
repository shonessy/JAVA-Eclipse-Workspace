
public class SimpleDotCom {
	private int locationCells[];
	private int numOfHits=0;
	
	public void setLocationCells(int a[]){
		locationCells=a;
		}
	
	public String checkYourGuess(String a){
		int guess=Integer.parseInt(a);
		String result="Miss";
		
		for(int i=0;i<locationCells.length;i++){
			if(locationCells[i]==guess){
				numOfHits++;
				result="Hit";
				break;
				}
			}
		if(numOfHits==locationCells.length)
			result="Kill";
		
		System.out.println(result);
		return result;
		}
}


public class ByTwos implements Serija{
	int start;
	int prevVal;
	int currVal;
	
	public ByTwos() {
		start=0;
		prevVal=-2;
		currVal=0;
		}
		
	// implements
	public void setStart(int x){
		start=x;
		currVal=x;
		prevVal=x-2;
		}
	
	public int getNext(){
		prevVal=currVal;
		currVal+=2;
		return currVal;
		}
	
	public void reset(){
		currVal=start;
		prevVal=start-2;
		}
	
	// it's own method
	int getPreVal(){
		return prevVal;
		}
	
	
}

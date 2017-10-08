
public class ByThrees implements Serija{
	int start;
	int prevVal;
	int currVal;
	
	ByThrees(){
		start=0;
		currVal=0;
		prevVal=-3;
		}
	
	//implements
	public void setStart(int x){
		start=x;
		currVal=x;
		prevVal=x-3;
	}
	
	public int getNext(){
		prevVal=currVal;
		currVal+=3;
		return currVal;
	}
	
	public void reset(){
		currVal=start;
		prevVal=start-3;
	}
	
	//it's own method
	int getPrevVal(){
		return prevVal;
	}
	
	
	
	
	
	
}

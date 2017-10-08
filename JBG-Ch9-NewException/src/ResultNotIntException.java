
public class ResultNotIntException extends Exception{
	private int x,
				y;
	
	//Constructor
	public ResultNotIntException(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//toString
	@Override
	public String toString(){
		return "Result of " + x + " / " + y +
				" is not integer";
	}
}


public class GenConstructor {
	private int sum;
	
	//generic constructor
	public <T extends Number> GenConstructor(T num){
		sum=0;
		for(int i=1; i<=num.intValue(); i++)
			sum+=i;
	}
	
	//get sum
	public int getSum(){
		return sum;
	}
}

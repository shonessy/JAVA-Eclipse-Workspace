
public class NewThread implements Runnable{
	Thread thrd;
	private int limit;
	private int count;
	
	//Constructor
	public NewThread(String name, int limit){
		thrd=new Thread(this, name);
		this.limit=limit;
		this.count=0;
	}
	
	//run
	@Override
	public void run(){
		for(count=0; count<limit; count++);
	}
	
	//toString
	@Override
	public String toString(){
		return thrd.getName() + ": " + count;
	}
	
}


public class NewThread extends Thread{
	
	//constructor
	public NewThread(String name){
		super(name);
		start();
	}
	
	//run
	@Override
	public void run(){
		System.out.println("Starting: " + getName() + "...");
		for(int i=0; i<50; i++){
			System.out.println("\t\tThread " + getName() + ": " + (i+1) );
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("Greska u sleep-New Thread");
			}
		}
		System.out.println("Exiting: " + getName());
	
	}

}

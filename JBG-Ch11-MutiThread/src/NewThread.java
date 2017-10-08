
public class NewThread implements Runnable{
	Thread thread;
	
	//Constructor
	public NewThread(String name){
		thread=new Thread(this, name);
		thread.start();
	}
	
	//run
	@Override
	public void run(){
		System.out.println("Starting: " + thread.getName() + "...");
		for(int i=0; i<50; i++){
			System.out.println("\t\tThread " + thread.getName() + ": " + (i+1) );
			try{
				thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println("Greska u sleep-New Thread");
			}
		}
		System.out.println("Exiting: " + thread.getName());
	}
}

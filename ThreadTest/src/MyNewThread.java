
public class MyNewThread implements Runnable{
	Thread t;
	
	//Constructor
	public MyNewThread(String threadName){
		t=new Thread(this, threadName);
		System.out.print("Constructing: " + t.getName());
		System.out.println(" from " + Thread.currentThread().getName());
	}
	
	//startThread
	public void startThread(){
		System.out.print("Starting: " + t.getName());
		System.out.println(" from " + Thread.currentThread().getName());
		t.start();
	}
	
	//run
	public void run(){
		System.out.print("Running: " + t.getName());
		System.out.println(" from " + Thread.currentThread().getName());
		try{
			for(int i=0; i<25; i++){
			System.out.print("\tThread: " + t.getName());
			System.out.println("  i= " + i);
			Thread.sleep(200);
			}
		}catch(InterruptedException e){
			System.out.println("Thread: " + t.getName() + " INTERRUPTED");
		}
		System.out.print("Finishing: " + t.getName());
		System.out.println(" from " + Thread.currentThread().getName());
	}
}

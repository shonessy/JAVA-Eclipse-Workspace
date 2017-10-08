
public class Test {

	public static void main(String[] args) {
		NewThread nt1=new NewThread("Thread 1");
		NewThread nt2=new NewThread("Thread 2");
		NewThread nt3=new NewThread("Thread 3");
		NewThread nt4=new NewThread("Thread 4");
		System.out.println("Prioriteti: ");
		System.out.println("Th1: " + nt1.thread.getPriority());
		System.out.println("Starting Main Thread...");
		for(int i=0; i<12; i++){
			System.out.println("Maint Thread: " + (i+1));
			try{
				Thread.sleep(500);
				nt4.thread.join();
			}catch(InterruptedException e){
				System.out.println("Greska u sleep-Main Thread");
			}
		}
		System.out.println("Exiting Main Thread");
	}

}

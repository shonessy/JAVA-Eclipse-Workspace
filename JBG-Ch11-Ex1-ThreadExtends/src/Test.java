
public class Test {

	public static void main(String[] args) {
		NewThread nthrd=new NewThread("Thread 1");
		System.out.println("Starting Main Thread...");
		for(int i=0; i<12; i++){
			System.out.println("Maint Thread: " + (i+1));
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("Greska u sleep-Main Thread");
			}
		}
		System.out.println("Exiting Main Thread");
	}

}

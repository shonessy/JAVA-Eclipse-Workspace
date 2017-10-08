
public class Test {

	public static void main(String[] args) {
		System.out.println("Starting: " + Thread.currentThread().getName());
		MyNewThread mnt=new MyNewThread("Nit1");
		mnt.startThread();
		
		try{
			for(int i=0; i<6; i++){
				System.out.print("Thread: " + Thread.currentThread().getName());
				System.out.println("  i= " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Thread: " + Thread.currentThread().getName() 
							 + " INTERRUPTED");
			}
		
		System.out.println("Finishing: " + Thread.currentThread().getName());
	
	}
		
}



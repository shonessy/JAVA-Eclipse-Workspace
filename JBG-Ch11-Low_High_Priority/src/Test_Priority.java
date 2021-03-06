import java.lang.Thread;
public class Test_Priority {

	public static void main(String[] args) {
		NewThread th1=new NewThread("Thread 1", 1_000_000_000);
		NewThread th2=new NewThread("Thread 2", 1_000_000_000);
		th1.thrd.setPriority(Thread.MIN_PRIORITY);
		th2.thrd.setPriority(Thread.MAX_PRIORITY);
		
		th1.thrd.start();
		th2.thrd.start();
		while(th1.thrd.isAlive() && th2.thrd.isAlive());
		System.out.println(th1);
		System.out.println(th2);
		
	}

}

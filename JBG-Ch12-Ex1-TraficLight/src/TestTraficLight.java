import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestTraficLight {

	public static void main(String[] args) throws IOException{
		TraficLight tl=new TraficLight();
		/*BufferedReader br;
		synchronized (System.in) {
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		boolean isRunning=false;
		
		System.out.println("Za paljenje semafora ukucajte: start");
		String s=br.readLine();
		if(s.equals("start")){
			System.out.println("Semafor ukljucen......\n");
			isRunning=true;
			tl.startTraficLight();
		}*/
		
		tl.startTraficLight();
		try{
			Thread.sleep(20_000);
		}catch(InterruptedException e){
			
		}
		tl.stopTraficLight();
		
		//System.out.println(Thread.currentThread().getName());
		
	
	
	}
	

}

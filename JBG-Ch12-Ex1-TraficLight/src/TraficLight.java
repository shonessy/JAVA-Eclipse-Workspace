
public class TraficLight implements Runnable {
	private Thread t;
	private TraficLightColors tlc,
							  previous;
	private boolean isWorking;
	
	//constructor
	public TraficLight(){
		t=new Thread(this);
		tlc=TraficLightColors.RED;
		previous=TraficLightColors.YELLOW;
		isWorking=false;
		t.start();
	}
	
	//start TraficLight
	public synchronized void startTraficLight(){
		//System.out.println("Semafor ukljucen ....");
		System.out.println("Start thread: " + Thread.currentThread().getName());

		isWorking=true;
	}
	
	//stop TraficLight
	public synchronized void stopTraficLight(){
		System.out.println("Stop thread: " + Thread.currentThread().getName());

		System.out.println("\nSemafor iskljucen ...");
		isWorking=false;
	}
	
	//run
	@Override
	public void run(){
		System.out.println("Run thread: " + Thread.currentThread().getName());

		while(isWorking){
			System.out.print(tlc + "  ");
			switch(tlc){
				case RED:
					sleepPrint(tlc);
					break;
				case YELLOW:
					sleepPrint(tlc);
					break;
				case GREEN:
					sleepPrint(tlc);
					break;
			}
			switchColor(tlc);
		}
	}
	
	synchronized void switchColor(TraficLightColors tlc){
		switch(tlc){
			case RED:
				this.tlc=TraficLightColors.YELLOW;
				break;
			case YELLOW:
				if(previous==TraficLightColors.RED)
					this.tlc=TraficLightColors.GREEN;
				else{
					this.tlc=TraficLightColors.RED;
					System.out.println();
				}
				break;
			case GREEN:
				this.tlc=TraficLightColors.YELLOW;
				break;
		}
		previous=tlc;
	}
	
	void sleepPrint(TraficLightColors tlc){
		for(int i=0; i<tlc.getDuration(); i++){
			System.out.print(".");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Greska u sleep");
			}
		}
		System.out.println();
	}
	
}

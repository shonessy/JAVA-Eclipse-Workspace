
public class CubeDemo {

	public static void main(String[] args) {
		Cube k1=new Cube(10, 20, 30);
		Cube k2=k1;
		Cube k3=new Cube(15,20,20);
		
		//kocke
		if(k1.sameCube(k2)==true) 
			System.out.println("Kocke k1 i k2 su iste") ;
		else
				System.out.println("Kocke k1 i k2 su razlicite");
		
		if(k1.sameCube(k3)==true) 
			System.out.println("Kocke k1 i k3 su iste") ;
		else
				System.out.println("Kocke k1 i k3 su razlicite");
		
		if(k2.sameCube(k3)==true) 
			System.out.println("Kocke k2 i k2 su iste") ;
		else
				System.out.println("Kocke k2 i k3 su razlicite");
		
		System.out.println("\n");
		
		
		//zapremine
		if(k1.sameVolume(k2)==true) 
			System.out.println("Zapremine kocki k1 i k2 su iste") ;
		else
				System.out.println("Zapremine kocki  k1 i k2 su razlicite");
		
		if(k1.sameVolume(k3)==true) 
			System.out.println("Zapremine kocki  k1 i k3 su iste") ;
		else
				System.out.println("Zapremine kocki  k1 i k3 su razlicite");
		
		if(k2.sameVolume(k3)==true) 
			System.out.println("Zapremine kocki  k2 i k2 su iste") ;
		else
				System.out.println("Zapremine kocki  k2 i k3 su razlicite");
		
	}

}

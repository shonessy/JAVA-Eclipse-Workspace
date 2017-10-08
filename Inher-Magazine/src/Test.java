
public class Test {
	public static void main(String args[]){
		Publication pub1=new Publication("McHill", 134, 17.99, "Effective Java");
		System.out.println(pub1);
		pub1.buy("Mirosla Ilic", 12.45);
		pub1.buy("Nesa Bridzis", 24.55);
		System.out.println(pub1);
		System.out.println();
	
		Magazine mag1=new Magazine("Grand", 28, 13.70, "Grand Revija", "Weekly", 3);
		System.out.println(mag1);
		System.out.println(mag1.getOwner());
		mag1.buy("Pera", 6.60);
		//mag1.
		
	}
	
}

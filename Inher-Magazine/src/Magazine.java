
public class Magazine extends Publication{
	private String frequency;	//monthly, weekly, bi-weekly
	private int subscriptionsLeft;
	
	//Constructors
	public Magazine(String publisher, int numOfPages, double price, String title, String frequency, int subscriptionsLeft){
		super(publisher, numOfPages, price, title);
		this.frequency=frequency;
		this.subscriptionsLeft=subscriptionsLeft;
	}
	
	//Setters & Getters
	public String getFrequency(){
		return frequency;
	}
	public int getSubscriptionsLeft(){
		return subscriptionsLeft;
	}
	
	//toString
	@Override
	public String toString(){
		return "Magazine: Frequency= " + frequency +
				", Subscriptions Left= " + subscriptionsLeft +
				" is a\n\t" + super.toString();
	}
	
	//print Title
	public void printTitle(){
		System.out.println(getTitle());
	}
	
	//subscribe for 1 year
	public String subscribe(String newOwner, double price){
		if(subscriptionsLeft<1){
			System.out.println("Nema vise dostupnih magazina za pretplatu");
			return getOwner();
		}
		
		int numOfPunInYear=0;
		if(frequency.equals("Monthly"))
			numOfPunInYear=12;
		else if(frequency.equals("Weekly"))
			numOfPunInYear=12*4;
		else if(frequency.equals("Bi-Weekly")){
			numOfPunInYear=12*4*2;
		}
		
		if(price>=numOfPunInYear*1){
			setOwner(newOwner);
			subscriptionsLeft--;
			System.out.println("Uspjesna pretplata");
		}
		else 
			System.out.println("Neuspjesna pretplata");
		return getOwner();
	}

}

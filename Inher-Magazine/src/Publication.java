
public class Publication {
	private String publisher;
	private int numOfPages;
	private double price;
	private String owner;
	private String title;
	
	//Constructor
	public Publication(String publisher, int numOfPages, double price, String title){
		this.publisher=publisher;
		this.numOfPages=numOfPages;
		this.price=price;
		this.title=title;
		this.owner=null;
	}
	
	//Setters & Getters
	public String getPublishe(){
		return publisher;
	}
	public int getNumOfPages(){
		return numOfPages;
	}
	public double getPrice(){
		return price;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	public String getTitle(){
		return title;
	}
	
	//toStringg
	@Override
	public String toString(){
		return "Publication[Publisher: " + publisher + 
				", Pages: " + numOfPages + 
				", Price: " + price + 
				", Owner: " + owner + 
				", Title: " + title + "]";
	}
	
	//Buy
	public String buy(String newOwner, double price){
		if(price>=this.price){
			this.owner=newOwner;
			System.out.println("Uspjesna kupovina");
		}
		else 
			System.out.println("Neuspjesna kupovina");
		return owner;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

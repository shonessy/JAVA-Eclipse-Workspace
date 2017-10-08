
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	
	//Constructors
	public Book(String name, Author author, double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name, Author author, double price, int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	
	//Setters & Getters
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
		
	//toString
	public String toString(){
		return "Book[name=" + name + 
				", " + author.toString() + 
				", " + price + 
				", qty" + qty + "]";
	}
	
	//return author's name
	public String getAuthorName(){
		return author.getName();
	}
	
	//return author's email
	public String getAuthorEmail(){
		return author.getEmail();
	}
	
	//return author's gender
	public char getAuthorGender(){
		return author.getGender();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


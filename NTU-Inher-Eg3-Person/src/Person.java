
public class Person {
	private String name;
	private String address;
	
	//Constructors
	public Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	
	//Setters & Getters
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
	
	//toString
	@Override
	public String toString(){
		return name + "(" + address + ")";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

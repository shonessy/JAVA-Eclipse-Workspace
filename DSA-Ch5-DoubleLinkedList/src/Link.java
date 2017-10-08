
public class Link {
	private String employeeName;
	private int employeeSalary;
	private Link next;
	private Link previous;
	
	//--------------------------------------------//
	//constructor
	public Link(String name, int salary){
		employeeName=name;
		employeeSalary=salary;
		next=null;
		previous=null;
	}
	//--------------------------------------------//
	//getNext
	public Link getNext(){
		return next;
	}
	//--------------------------------------------//
	//setNext
	public void setNext(Link next){
		this.next=next;
	}
	//--------------------------------------------//
	//getNext
	public Link getPrevious(){
		return previous;
	}
	//--------------------------------------------//
	//setNext
	public void setPrevious(Link previous){
		this.previous=previous;
	}
	//--------------------------------------------//
	//get name
	public String getName(){
		return this.employeeName;
	}
	//--------------------------------------------//
	//get salary
	public int getSalary(){
		return this.employeeSalary;
	}
	//--------------------------------------------//
	//to string
	@Override
	public String toString(){
		return "[name: " + employeeName + 
				", salary: " + employeeSalary + "]";
	}
	//--------------------------------------------//
	
}

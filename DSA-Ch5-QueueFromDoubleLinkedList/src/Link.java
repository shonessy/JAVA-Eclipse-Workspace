
public class Link {
	private String employeeName;
	private int employeeSalary;
	private Link next;
	
	//--------------------------------------------//
	//constructor
	public Link(String name, int salary){
		employeeName=name;
		employeeSalary=salary;
		next=null;
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

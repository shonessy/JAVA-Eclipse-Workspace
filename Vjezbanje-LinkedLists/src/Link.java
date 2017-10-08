
public class Link {
	private String name;
	private int salary;
	private Link next;
	
	//----------------------------------------------------------//
	//constructor
	public Link(String name, int salary){
		this.name=name;
		this.salary=salary;
		next=null;
	}
	//----------------------------------------------------------//
	public String getName(){
		return name;
	}
	//----------------------------------------------------------//
	public int getSalary() {
		return salary;
	}
	//----------------------------------------------------------//
	public Link getNext() {
		return next;
	}
	//----------------------------------------------------------//
	public void setNext(Link next) {
		this.next=next;
	}
	//----------------------------------------------------------//
	@Override
	public String toString(){
		return "[Name: " + name + ", Salary: " + salary + "]";
	}
	//----------------------------------------------------------//
}

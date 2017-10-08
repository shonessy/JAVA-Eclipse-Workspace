
public class Employee {
	private String name;
	private int salary;
	
	//---------------------------------------------//
	//constructor
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	//---------------------------------------------//
	// get name
	public String getName() {
		return name;
	}
	//---------------------------------------------//
	//get salary
	public int getSalary() {
		return salary;
	}
	//---------------------------------------------//
	//to string
	@Override
	public String toString(){
		return "[" + name + " - " + salary + "$" + "]";
	}
	//---------------------------------------------//

}

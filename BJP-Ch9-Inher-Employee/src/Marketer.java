
public class Marketer extends Employee{
	
	//Constructors
	public Marketer(){
		super();
		super.setBaseSalary(getBaseSalary()+10_000);
	}
	
	//toSTring
	@Override
	public String toString(){
		return "PR - " + super.toString();
	}
	
	//Public Methods
	public void advertise(){
		System.out.println("No such thing as bad comercial!");
	}
	

}

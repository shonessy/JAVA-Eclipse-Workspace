
public class Janitor extends Employee{
	
	//Constructors
	public Janitor(){
		super();
		super.setBaseSalary(getBaseSalary()-10_000);
		super.setBaseHours(80);
		setBaseVacationDays(5);
	}
	
	//toString
	public String toString(){
		return "Domar - " + super.toString();
	}
	
	//Public Methods
	public void clean(){
		System.out.println("Ja cistim i cuvam!");
	}
}

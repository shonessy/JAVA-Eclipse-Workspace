
public class Lawyer extends Employee{
	
	//Default fields
	private static final String BASE_VACATION_FORM_LAWYER="Blue";
	//Constructors
	public Lawyer(){
		super();
		super.setBaseVacationDays(getBaseVacationDays() + 5);
		super.setBaseVacationForm(BASE_VACATION_FORM_LAWYER);
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Advokat - " + super.toString();
	}
	
	//Public methods
	public void sue(){
		System.out.println("Vidimo se na sudu!");
	}
	
	
}

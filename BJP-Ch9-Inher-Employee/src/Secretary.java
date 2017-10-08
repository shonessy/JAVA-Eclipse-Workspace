
public class Secretary extends Employee{
	//Inheres all fields and methods from Employee
	
	//Constructors
	public Secretary(){
		super();
	}
	
	//toString
	@Override
	public String toString(){
		return "Sekretarica - " + super.toString();
	}
	
	//Public methods	
	public void takeDictation(String dictation){
		System.out.println("Sefe, zapisala sam tekst koji ste izdiktirali: \n\t" + dictation);
	}
}


public class HarwardLawyer extends Lawyer{
	
	//Constructors
	public HarwardLawyer(){
		super();
		super.setBaseSalary(getBaseSalary()*1.2);
		super.setBaseVacationDays(getBaseVacationDays()+3);
	}
	
	//toString
	@Override
	public String toString(){
		return "Advokat sa Hardvarda je " + super.toString();
	}
	
	//Public Methods
	@Override
	public String getBaseVacationForm(){
		String ret="";
		for(int i=0;i<4; i++)
			ret+=super.getBaseVacationForm();
		return ret;
	}
}

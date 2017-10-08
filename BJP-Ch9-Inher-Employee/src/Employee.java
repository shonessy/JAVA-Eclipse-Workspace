
public abstract class Employee {
	private int baseHours;
	private double baseSalary;
	private int baseVacationDays;
	private String baseVacationForm;
	
	//Default Fields
	private static final int BASE_HOURS=40;
	private static final double BASE_SALARY=40_000;
	private static final int BASE_VACATION_DAYS=10;
	private static final String BASE_VACATION_FORM="Yellow";
	
	//Constructors
	public Employee(){
		baseHours=BASE_HOURS;
		baseSalary=BASE_SALARY;
		baseVacationDays=BASE_VACATION_DAYS;
		baseVacationForm=BASE_VACATION_FORM;
	}
	public Employee(int baseHours, double baseSalary, int baseVacationDays, String baseVacationForm){
		this.baseHours=baseHours;
		this.baseSalary=baseSalary;
		this.baseVacationDays=baseVacationDays;
		this.baseVacationForm=baseVacationForm;
	}
	public Employee(Employee another){
		this.baseHours=another.baseHours;
		this.baseSalary=another.baseSalary;
		this.baseVacationDays=another.baseVacationDays;
		this.baseVacationForm=another.baseVacationForm;
	}
	
	//Setters & Getters
	public void setBaseHours(int baseHours){
		this.baseHours=baseHours;
	}
	public int getBaseHours(){
		return baseHours;
	}
	public void setBaseSalary(double baseSalary){
		this.baseSalary=baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseVacationDays(int baseVacationDays) {
		this.baseVacationDays=baseVacationDays;
	}
	public int getBaseVacationDays(){
		return baseVacationDays;
	}
	public void setBaseVacationForm(String baseVacationFrom){
		this.baseVacationForm=baseVacationFrom;
	}
	public String getBaseVacationForm(){
		return baseVacationForm;
	}
	
	//toSTrin
	@Override
	public String toString(){
		return "Zaposleni sa: [baseHours=" + baseHours +
				", baseSalary=" + baseSalary + 
				", baseVacationDays=" + baseVacationDays +
				", baseVacationForm=" + baseVacationForm + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

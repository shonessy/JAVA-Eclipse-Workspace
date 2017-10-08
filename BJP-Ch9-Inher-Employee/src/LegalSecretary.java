
public class LegalSecretary extends Secretary{
	
	//Constructors
	public LegalSecretary(){
		super();
		setBaseSalary(getBaseSalary()+5_000);
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Pravna Sekretarica je " + super.toString();
	}
	
	//Public method
	public void fileDocument(String documentName){
		System.out.println("Sefe, zavela sam dokument: " + documentName);
	}
}

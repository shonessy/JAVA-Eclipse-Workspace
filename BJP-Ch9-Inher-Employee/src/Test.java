
public class Test {

	public static void main(String[] args) {
		Secretary s1=new Secretary();
		System.out.println(s1);
		s1.takeDictation("Dana 21.04.2016.god, ja, Direktor ove firme, sam sebi uvecao platu za 5000e");
		System.out.println();
		
		LegalSecretary ls1=new LegalSecretary();
		System.out.println(ls1);
		ls1.takeDictation("Po odluci tuzenog, Ilije Grahovca, zvanog Zmaj od Sipova, odluceno je sledece: ");
		ls1.fileDocument("Tuzba broj 154/27");
		System.out.println("LS1 plata: " + ls1.getBaseSalary());
		System.out.println();
		
		Lawyer lw1=new Lawyer();
		System.out.println(lw1);
		lw1.sue();
		System.out.println();
		
		HarwardLawyer hwlw1=new HarwardLawyer();
		System.out.println(hwlw1);
		hwlw1.sue();
		System.out.println(hwlw1.getBaseVacationForm());
		System.out.println();
		
		Marketer mr1=new Marketer();
		System.out.println(mr1);
		mr1.advertise();
		System.out.println();
		
		Janitor jn1=new Janitor();
		System.out.println(jn1);
		jn1.clean();
		
		
		
	}

}

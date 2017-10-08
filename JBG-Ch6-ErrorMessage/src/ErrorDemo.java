
public class ErrorDemo {

	public static void main(String[] args) {
		Error e1=new Error("Ovo nije greska", -1);
		Error e2=PreedefinedErrors.getPreedefinedErrorInfo(2);
		Error e3=PreedefinedErrors.getPreedefinedErrorInfo(-19);
		
		System.out.println(" e1: ");
		e1.printError();
		
		System.out.println("\n e1: ");
		e2.printError();
		
		System.out.println("\n e1: ");
		e3.printError();
		

	}

}

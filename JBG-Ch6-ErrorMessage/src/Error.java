
public class Error {
	private String msg;
	private int severity;
	
	Error(String s, int a){
		msg=s;
		severity=a;
		}
	
	void printError(){
		System.out.println(msg);
		System.out.println("Severity: " + severity);
		}
}

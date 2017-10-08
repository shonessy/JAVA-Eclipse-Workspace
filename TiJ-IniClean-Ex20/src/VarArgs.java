
public class VarArgs {
	
	//metoda prima varargs string
	public void varArgs(String... s){
		for(int i=0; i<s.length; i++)
			System.out.println( (i+1) + ". " + s[i]);
	}
}


public class BracketChecker {
	//private String input;
	
	//------------------------------------//
	//constructor
	/*public BracketChecker(String input){
		this.input=input;
	}*/
	//------------------------------------//
	//check
	public void check(String input){
		GenericStack<Character> stack = new GenericStack<>(input.length());
		char c;
		boolean isOk = true;
		try{
			for(int i=0; i<input.length(); i++){
				c = input.charAt(i);
				if(c=='{' || c=='[' || c=='(')
					stack.push(c);
				else if(c=='}' || c==']' || c==')'){
					char x = stack.pop();
					if( (c=='}' && x!='{') || 
						(c==']' && x!='[') || 
						(c==')' && x!='(') ){
						System.out.println("\tMistake: " + c );
						isOk=false;
						break;
					}
				}
			}
			if(!stack.isEmpty())
				while(!stack.isEmpty())
					System.out.println("\tMistake: " + stack.pop() );
			else if(isOk)
				System.out.println("\tExpresion OK");
		}catch(StackFullException e){
			System.out.println(e);
		}catch(StackEmptyException e){
			System.out.println(e);
		}
	}
	//------------------------------------//
}

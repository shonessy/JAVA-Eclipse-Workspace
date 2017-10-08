
public class Reverser {
		
	//------------------------------------------------//
	// reverse string
	public String doRev(String input){
		String output="";
		CharStack stack = new CharStack(input.length());
		
		try{
			
			for(int i=0; i<input.length(); i++)
			stack.push(input.charAt(i));
			
			while(!stack.isEmpty())
				output+=stack.pop();
			
		}catch(StackFullException e){
			System.out.println(e);
		}catch(StackEmptyException e){
			System.out.println(e);
		}
		
		return output;
	}
	//------------------------------------------------//
	// reverse string
	public String doRevWithGenericStack(String input){
		String output="";
		GenericStack<Character> stack = new GenericStack<>(input.length());
			
		try{
				
			for(int i=0; i<input.length(); i++)
			stack.push(input.charAt(i));
				
			while(!stack.isEmpty())
				output+=stack.pop();
				
		}catch(StackFullException e){
			System.out.println(e);
		}catch(StackEmptyException e){
			System.out.println(e);
		}
			
		return output;
		}
		//------------------------------------------------//
}

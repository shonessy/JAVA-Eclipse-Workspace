
public class CharStack {
	private char charArray[];
	private int top;
	
	//---------------------------------------//
	//constructor
	public CharStack(int max){
		charArray=new char[max];
		top=-1;
	}
	//---------------------------------------//
	//push
	public void push(char c) throws StackFullException{
		if(++top>charArray.length-1)
			throw new StackFullException();
		charArray[top]=c;
	}
	//---------------------------------------//
	//pop
	public char pop() throws StackEmptyException{
		if(top==-1)
			throw new StackEmptyException();
		return charArray[top--];
	}
	//---------------------------------------//
	//peek
	public char peek() throws StackEmptyException{
		if(top==-1)
			throw new StackEmptyException();
		return charArray[top];
	}
	//---------------------------------------//
	//is empty
	public boolean isEmpty(){
		return (top==-1);
	}
	//---------------------------------------//
	//is full
	public boolean isFull(){
		return (top>=charArray.length);
	}
	//---------------------------------------//
	
}

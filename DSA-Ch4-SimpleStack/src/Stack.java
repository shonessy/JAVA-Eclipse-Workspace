
public class Stack {
	private int stackArray[];
	private int top;
	
	//----------------------------------//
	//constructor
	public Stack(int max){
		stackArray = new int[max];
		top=-1;
	}
	//----------------------------------//
	//push
	public void push(int x) throws StackFullException{
		if(++top>=stackArray.length)
			throw new StackFullException();
		stackArray[top]=x;
		
	}
	//----------------------------------//
	//pop
	public int pop() throws StackEmptyException{
		if(top<0)
			throw new StackEmptyException();
		return stackArray[top--];
	}
	//----------------------------------//
	//peek
	public int peek() throws StackEmptyException{
		if(top<0)
			throw new StackEmptyException();
		else
			return stackArray[top];
	}
	//----------------------------------//
	//is empty
	public boolean isEmpty(){
		return (top==-1);
	}
	//----------------------------------//
	//is full
	public boolean isFull(){
		return (top==stackArray.length-1);
	}
	//----------------------------------//

}

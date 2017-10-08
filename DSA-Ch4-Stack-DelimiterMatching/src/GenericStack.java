
public class GenericStack <T> {
	private T stackArray[];
	private int top;
	
	//---------------------------------------//
	//constructor
	public GenericStack(int max){
		stackArray=(T[]) new Object[max];
		top=-1;
	}
	//---------------------------------------//
	//push
	public void push(T element) throws StackFullException{
		if(++top>stackArray.length-1)
			throw new StackFullException();
		stackArray[top]=element;
	}
	//---------------------------------------//
	//pop
	public T pop() throws StackEmptyException{
		if(top==-1)
			throw new StackEmptyException();
		return stackArray[top--];
	}
	//---------------------------------------//
	//peek
	public T peek() throws StackEmptyException{
		if(top==-1)
			throw new StackEmptyException();
		return stackArray[top];
	}
	//---------------------------------------//
	//is empty
	public boolean isEmpty(){
		return (top==-1);
	}
	//---------------------------------------//
	//is full
	public boolean isFull(){
		return (top>=stackArray.length);
	}
	//---------------------------------------//
	
}

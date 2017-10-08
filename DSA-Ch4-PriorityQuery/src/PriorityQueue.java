
public class PriorityQueue  {
	
	private int qArray[];
	private int top;
	
	//------------------------------------------//
	//constructor
	public PriorityQueue(int max){
		qArray = new int[max];
		top=-1;
	}
	//------------------------------------------//
	//insert
	public void insert(int element) throws PriorityQueueFullException{
		if(isFull())
			throw new PriorityQueueFullException();
		if(isEmpty()){
			qArray[++top] = element;
			return;
		}
		int i = top++;
		while(i>=0 && qArray[i] < element)
			qArray[i+1]=qArray[i--];
		qArray[++i]=element;
	}
	//------------------------------------------//
	//remove
	public int remove() throws PriorityQueueEmptyException{
		if(top<0)
			throw new PriorityQueueEmptyException();
		return qArray[top--];
	}
	//------------------------------------------//
	//peek
	public int peek(){
		return qArray[top];
	}
	//------------------------------------------//
	//is empty
	public boolean isEmpty(){
		return (top==-1);
	}
	//------------------------------------------//
	//is full
	public boolean isFull(){
		return (top==qArray.length-1);
	}
	//------------------------------------------//
	//toString
	public String toString(){
		String ret="\n\t";
		for(int i=top; i>=0; i--)
			ret+=qArray[i] + ", ";
		return ret;
	}
	//------------------------------------------//
	//compareinto
	/*@Override
	public int compareinto(int obj){
		return 1;
	}*/
	//------------------------------------------//
}

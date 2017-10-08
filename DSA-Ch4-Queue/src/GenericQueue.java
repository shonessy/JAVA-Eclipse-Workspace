
public class GenericQueue <T> {
	private T queueArray[];
	private int front;
	private int rear;
	private int nElem;
	
	//------------------------------------------//
	//constructor
	public GenericQueue(int max){
		queueArray = (T[]) new Object[max];
		front=0;
		rear=-1;
		nElem=0;
	}
	//------------------------------------------//
	//insert
	public void insert(T element){
		if(rear==queueArray.length-1)
			rear=-1;
		if(++rear==front  && nElem>0){
			System.out.println("*****Queue Full*****");
			rear--;								//undo
			return;
		}
		queueArray[rear]=element;
		nElem++;
	}
	//------------------------------------------//
	//remove
	public T remove(){
		T temp = queueArray[front];
		if(front==queueArray.length-1)
			front=-1;
		front++;	
		nElem--;
		return temp;
	}
	//------------------------------------------//
	//peek
	public T peek(){
		return queueArray[front];
	}
	//------------------------------------------//
	//length
	public int length(){
		return nElem;
	}
	//------------------------------------------//
	//isFull
	public boolean isFull(){
		return (nElem==queueArray.length);
	}
	//------------------------------------------//
	//isEmpty
	public boolean isEmpty(){
		return (nElem==0);
	}
	//------------------------------------------//
	//to string 
	@Override
	public String toString(){
		String ret="";
		for(int i=front, j=0; j<nElem; i++, j++){
			if(i==queueArray.length)
				i=0;
			ret+=queueArray[i] + ", ";
		}
		return ret;
	}
	//------------------------------------------//
	
}

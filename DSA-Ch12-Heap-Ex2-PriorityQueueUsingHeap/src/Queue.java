
public class Queue {
	private Heap heap;
	
//	----------------------------------------------------
	//constructor
	public Queue(int max){
		heap=new Heap(max);
	}
//	----------------------------------------------------
	//insert
	public boolean isEmpty() {
		return heap.isEmpty();
	}
//	----------------------------------------------------
	//is full
	public boolean isFull() {
		return heap.isFull();
	}
//	----------------------------------------------------
	//insert
	public void insert(Employee employe){
		heap.insert(employe);
	}
//	----------------------------------------------------
	//remove
	public Employee remove() {
		return heap.remove();
	}
//	----------------------------------------------------
	//to string
	@Override
	public String toString(){
		return heap.toString();
	}
//	----------------------------------------------------
	//display heap
	public void displayQueue() {
		heap.displayHeap();
	}
//	----------------------------------------------------
}

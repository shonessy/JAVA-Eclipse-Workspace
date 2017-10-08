
public class LQueue {
	private DoubleEndList list;
	
	//--------------------------------------//
	//constructor
	public LQueue(){
		list=new DoubleEndList();
	}
	//--------------------------------------//
	//insert
	public void insert(Link element){
		list.insertLast(element);
	}
	//--------------------------------------//
	//remove
	public Link remove() {
		return list.deleteFirst();
	}
	//--------------------------------------//
	//peek
	public Link peek() {
		return list.getFirst();
	}
	//--------------------------------------//
	//is empty
	public boolean isEmpty() {
		return list.isEmpty();
	}
	//--------------------------------------//
	//to string
	@Override
	public String toString(){
		return list.toString();
	}
	//--------------------------------------//
}

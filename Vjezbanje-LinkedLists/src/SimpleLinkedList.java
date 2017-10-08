
public class SimpleLinkedList {
	private Link first;
	
	//----------------------------------------------------------//
	//constructor
	public SimpleLinkedList(){
		this.first=null;
	}
	//----------------------------------------------------------//
	public boolean isEmpty(){
		return first==null;
	}
	//----------------------------------------------------------//
	public void insertFirst(Link newLink){
		newLink.setNext(first);
		first=newLink;
	}
	//----------------------------------------------------------//
	public Link deleteFirst() {
		if(this.isEmpty())
			return first;
		Link tmp=first;
		first=first.getNext();
		return tmp;
	}
	//----------------------------------------------------------//
	public Link delete(int salary){
		Link previous=first;
		Link current=first;
		while(current.getNext() !=null && current.getSalary()!=salary){
			previous=current;
			current=current.getNext();
		}
		if(current.getSalary()==salary){
			previous.setNext(current.getNext());
			return current;
		}
		else
			return null;
		
	}
	//----------------------------------------------------------//
	public void displayList() {
		if(this.isEmpty())
			System.out.println("List is empty");
		Link tmp=first;
		while(tmp!=null){
			System.out.println(tmp);
			tmp=tmp.getNext();
		}
			
	}
	//----------------------------------------------------------//
}


public class Link {
	private int value;
	private Link next;
	
	//--------------------------------//
	//constructor
	public Link(int value){
		this.value=value;
		next=null;
	}
	//--------------------------------//
	//get value
	public int getValue() {
		return value;
	}
	//--------------------------------//
	//get next
	public Link getNext(){
		return next;
	}
	//--------------------------------//
	//set next
	public void setNext(Link next) {
		this.next=next;
	}
	//--------------------------------//
	//to string
	@Override
	public String toString(){
		return "" + value;
	}
	//--------------------------------//
}

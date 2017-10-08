
public class SortList {
	private Link first;
	
	//--------------------------------//
	//constructor
	public SortList(){
		first=null;
	}
	//--------------------------------//
	//get first
	public Link getFirst() {
		return first;
	}
	//--------------------------------//
	//set first
	public void setFirst(Link first) {
		this.first=first;
	}
	//--------------------------------//
	//is empty
	public boolean isEmpt() {
		return (first==null);
	}
	//--------------------------------//
	//insert
	public void insert(Link element) {
		if(this.isEmpt()){
			this.setFirst(element);
			return;
		}
		Link current=this.getFirst();
		Link previous=null;
		while(current != null && element.getValue()>current.getValue()){
			previous=current;
			current=current.getNext();
		}
		if(previous==null)
			this.setFirst(element);
		else
			previous.setNext(element);
		element.setNext(current);
	}
	//--------------------------------//
	//remove first
	public Link removeFirst() {
		Link temp=this.getFirst();
		this.setFirst(temp.getNext());
		return temp;
	}
	//--------------------------------//
	//to string
	@Override
	public String toString(){
		String ret="\t";
		Link current=this.getFirst();
		while(current!=null){
			ret+=current + "   ";
			current=current.getNext();
		}
		return ret;
	}
	//--------------------------------//
	
}

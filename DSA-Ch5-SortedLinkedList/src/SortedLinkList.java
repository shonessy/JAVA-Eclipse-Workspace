
public class SortedLinkList {
	private Link first;
	
	//--------------------------------------//
	//constructor
	public SortedLinkList(){
		first=null;
	}
	//--------------------------------------//
	//get first 
	public Link getFirst() {
		return first;
	}
	//--------------------------------------//
	//set first
	public void setFirst(Link first) {
		this.first=first;
	}
	//--------------------------------------//
	//insert
	public void insert(Link element) {
		if(this.isEmpty()){
			this.setFirst(element);
			return;
		}
		Link current=this.getFirst();
		Link previous=null;
		while(current !=null && current.getName().compareTo(element.getName())<0){
			previous=current;
			current=current.getNext();
		}
		if(previous==null)
			this.setFirst(element);
		else
			previous.setNext(element);
		element.setNext(current);
		
	}
	//--------------------------------------//
	//remove first
	public Link removeFirst() {
		Link temp=this.getFirst();
		this.setFirst(temp.getNext());
		return temp;
	}	
	//--------------------------------------//
	//is empty
	public boolean isEmpty() {
		return (first==null);
	}
	//--------------------------------------//
	//to string
	@Override
	public String toString(){
		Link current=this.getFirst();
		String ret="\t";
		while(current!=null){
			ret+=current + "\n\t";
			current=current.getNext();
		}
		return ret;
	}
	//-------------------------------------//
	
	
	
	
	
}

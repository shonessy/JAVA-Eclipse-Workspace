
public class DoubleLinkList {
	private Link first;
	private Link last;
	
	//--------------------------------------------------//
	//constructor
	public DoubleLinkList(){
		first=null;
		last=null;
	}
	//--------------------------------------------------//
	//is empty
	public boolean isEmpty() {
		return (first==null);
	}
	//--------------------------------------------------//
	//get first
	public Link getFirst() {
		return this.first;
	}
	//--------------------------------------------------//
	//get last
	public Link getLast() {
		return this.last;
	}
	//--------------------------------------------------//
	//set first
	public void setFirst(Link first){
		this.first=first;
	}
	//--------------------------------------------------//
	//set last
	public void setLast(Link last) {
		this.last=last;
	}
	//--------------------------------------------------//
	//insert first
	public void insertFirst(Link element){
		if(this.isEmpty()){
			this.setFirst(element);
			this.setLast(element);
			return;
		}
		Link temp=this.getFirst();
		this.setFirst(element);
		element.setNext(temp);
		temp.setPrevious(element);
	}
	//--------------------------------------------------//
	//insert last
	public void insertLast(Link element) {
		if(this.isEmpty()){
			this.setFirst(element);
			this.setLast(element);
			return;
		}
		Link temp=this.getLast();
		temp.setNext(element);
		element.setPrevious(temp);
		this.setLast(element);
	}
	//--------------------------------------------------//
	//insert after element
	public void insertAfter(Link after, Link element) {
		Link current=this.getFirst();
		while(current!=null && !current.getName().equals(after.getName())){
			current=current.getNext();
		}
		if(current==null){				//not find
			this.insertLast(element);
			return;
		}
		Link next=current.getNext();
		current.setNext(element);
		element.setNext(next);
		element.setPrevious(current);
		next.setPrevious(element);
	}
	//--------------------------------------------------//
	//delete first
	public Link deleteFirst() {
		if(this.isEmpty())
			return null;
		
		Link temp=this.getFirst();
		this.setFirst(temp.getNext());
				
		if(this.isEmpty()){
			this.setLast(null);
			return temp;
		}
		
		this.getFirst().setPrevious(null);	
		return temp;
	}
	//--------------------------------------------------//
	//delete last
	public Link deleteLast() {
		if(this.isEmpty())
			return null;
		
		Link temp=this.getLast();
		if(this.getFirst().getNext()==null)			//only 1 link in list 
			return this.deleteFirst();
				
		this.setLast(temp.getPrevious());
		this.getLast().setNext(null);
		return temp;
	}
	//--------------------------------------------------//
	//delete element
	public Link deleteElement(Link element) {
		if(this.isEmpty())
			return null;
		Link current=this.getFirst();
		while(current!=null && !current.getName().equals(element.getName()))
			current=current.getNext();
		if(current==null)				//not found
			return null;
		
		if(current.getNext()==null){	//single link in list and link==element
			this.deleteFirst();
			return current;
		}
		current.getPrevious().setNext(current.getNext());
		current.getNext().setPrevious(current.getPrevious());
		return current;
	}
	//--------------------------------------------------//
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
	//--------------------------------------------------//
}

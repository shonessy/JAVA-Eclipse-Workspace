
public class LinkList {
	private Link first;
	
	//--------------------------------------------//
	//constructor
	public LinkList(){
		first=null;
	}
	//--------------------------------------------//
	//get first
	public Link getFirst(){
		return first;
	}
	//--------------------------------------------//
	//set first
	public void setFirst(Link first){
		this.first=first;
	}
	//--------------------------------------------//
	//insert on first place
	public void insertFirst(String name, int salary){
		Link newFirst = new Link(name, salary);
		newFirst.setNext(this.getFirst());
		this.setFirst(newFirst);
		
	}
	//--------------------------------------------//
	//insert on first
	public void insertFirst(Link first){
		first.setNext(this.getFirst());
		this.setFirst(first);
	}
	//--------------------------------------------//
	//delete first
	public Link deleteFirst(){
		Link temp=this.getFirst();
		this.setFirst(temp.getNext());
		return temp;
	}
	//--------------------------------------------//
	//find link element
	public Link findByName(String name){
		Link current=this.getFirst();
		while(!current.getName().equals(name)){
			if(current.getNext()==null)
				return null;
			current=current.getNext();
		}
		return current;
	}
	//--------------------------------------------//
	//find salary
	public Link findBySalary(int salary){
		Link current=this.getFirst();
		while(current.getSalary() != salary){
			if(current.getNext()==null)
				return null;
			current=current.getNext();
		}
		return current;
	}
	//--------------------------------------------//
	//delete by name
	public Link deleteByName(String name){
		Link previous = null;
		Link current=this.getFirst();
		while(!current.getName().equals(name)){
			if(current.getNext()==null)
				return null;
			previous=current;
			current=current.getNext();
		}
		previous.setNext(current.getNext());
		return current;
	}
	//--------------------------------------------//
	//delete by salary
	public Link deleteBySalary(int salary){
		Link previous = null;
		Link current=this.getFirst();
			while(current.getSalary() != salary){
				if(current.getNext()==null)
					return null;
				previous=current;
				current=current.getNext();
			}
		previous.setNext(current.getNext());
		return current;
	}
	//--------------------------------------------//
	//is empty
	public boolean isEmpty(){
		return (first==null);
	}
	//--------------------------------------------//	
	//toString
	@Override
	public String toString(){
		String ret="\t";
		Link temp=this.getFirst();
		while(temp != null){
			ret+=temp + "\n\t";
			temp=temp.getNext();
		}
		return ret;
	}
	//--------------------------------------------//	
}

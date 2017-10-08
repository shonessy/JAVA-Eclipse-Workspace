
public class DoubleEndList {
	
	private Link first;
	private Link last;
	
	//---------------------------------------//
	//constructor
	public DoubleEndList(){
		first=null;
		last=null;
	}
	//---------------------------------------//
	//get first
	public Link getFirst() {
		return first;
	}
	//---------------------------------------//
	//get last
	public Link getLast() {
		return last;
	}
	//---------------------------------------//
	//set first
	private void setFirst(Link first) {
		this.first=first;
	}
	//---------------------------------------//
	//set last
	private void  setLast(Link last) {
		this.last=last;
	}
	//---------------------------------------//
	//insert first
	public void insertFirst(Link first){
		Link temp = this.getFirst();
		if(this.isEmpty())
			this.setLast(first);
		this.setFirst(first);
		first.setNext(temp);
	}
	//---------------------------------------//
	//insert last
	public void insertLast(Link last) {
		if(this.isEmpty()){
			this.insertFirst(last);
			return;
		}
		this.getLast().setNext(last);
		this.setLast(last);
	}
	//---------------------------------------//
	//delete first
	public Link deleteFirst() {
		Link temp=this.getFirst();
		if(this.isEmpty())
			this.setLast(null);
		this.setFirst(temp.getNext());
		return temp;
	}
	//---------------------------------------//
	//is empty
	public boolean isEmpty(){
		return (this.getFirst()==null);
	}
	//---------------------------------------//
	//to string
	@Override
	public String toString(){
		String ret="\t";
		Link current=this.getFirst();
		while(current != null){
			ret+=current + "\n\t";
			current=current.getNext();
		}
		return ret;
	}
	//---------------------------------------//

}


public class StackL {
	private LinkList lList;
	
	//------------------------------------------//
	//constructor
	public StackL(){
		lList=new LinkList();
	}
	//------------------------------------------//
	//push
	public void push(Link element){
		lList.insertFirst(element);
	}
	//------------------------------------------//
	//poop
	public Link poop() {
		return lList.deleteFirst();
	}
	//------------------------------------------//
	//peek
	public Link peek(){
		return lList.getFirst();
	}
	//------------------------------------------//
	//is full
	public boolean isEmptu() {
		return lList.isEmpty();
	}
	//------------------------------------------//
	//to string
	@Override
	public String toString(){
		return lList.toString();
	}
	//------------------------------------------//
}

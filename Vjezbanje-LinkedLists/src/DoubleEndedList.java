
public class DoubleEndedList {
		private Link first;
		private Link last;
	
		//----------------------------------------------------------//
		//constructor
		public DoubleEndedList(){
			this.first=null;
			this.last=null;
		}
		//----------------------------------------------------------//
		public boolean isEmpty(){
			return first==null;
		}
		//----------------------------------------------------------//
		public void insertFirst(Link newLink){
			if(this.isEmpty()){
				first=newLink;
				last=newLink;
				return;
			}
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
		public void insertLast(Link lastLink) {
			if(this.isEmpty()){
				first=lastLink;
				last=lastLink;
				return;
			}
			last.setNext(lastLink);
			last=lastLink;
		}
		//----------------------------------------------------------//
		public void displayList() {
			if(this.isEmpty())
				System.out.println("List empty");
			Link tmp=first;
			while(tmp!=null){
				System.out.println(tmp);
				tmp=tmp.getNext();
			}
				
		}
		//----------------------------------------------------------//
}

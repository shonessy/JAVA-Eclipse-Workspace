
public class Test {
	public static void main(String args[]){
		
		SimpleLinkedList sList=new SimpleLinkedList();
		sList.insertFirst(new Link("Jovan", 54_000));
		sList.insertFirst(new Link("Milos", 44_100));
		sList.insertFirst(new Link("Slavisa", 12_100));
		sList.insertFirst(new Link("Timotije", 52_100));
		sList.insertFirst(new Link("Marijan", 22_100));
		sList.insertFirst(new Link("Uros", 15_600));
		
		sList.displayList();
		System.out.println();
		
		sList.insertFirst(new Link("Mikajlo", 54_250));
		sList.displayList();
		System.out.println();
		
		System.out.println("Delete 54_000: " + sList.delete(54_000));
		sList.displayList();
		System.out.println();
		
		System.out.println("Delete 14_000: " + sList.delete(14_000));
		sList.displayList();
		System.out.println();
		
		System.out.println("Delete 52_100: " + sList.delete(52_100));
		sList.displayList();
		System.out.println();
		
		//-----------------------------------------------------------------//
		
		System.out.println("\n****************************************\n");
		System.out.println("DoublyEnded List: \n");
		
		DoubleEndedList deList =new DoubleEndedList();
		deList.insertFirst(new Link("Jovan", 54_000));
		deList.insertFirst(new Link("Milos", 44_100));
		deList.insertFirst(new Link("Slavisa", 12_100));
		deList.insertLast(new Link("Timotije", 52_100));
		deList.insertLast(new Link("Marijan", 22_100));
		deList.insertLast(new Link("Uros", 15_600));
		deList.displayList();
		System.out.println();
		
		deList.deleteFirst();
		deList.displayList();
		
	}
}

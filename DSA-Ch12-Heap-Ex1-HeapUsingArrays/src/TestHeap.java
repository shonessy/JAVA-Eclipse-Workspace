
public class TestHeap {

	
//	-----------------------------------------------------------
	//fill my myHeap
	public void fillMyHeap(Heap myHeap) {
		myHeap.insert(new Employee("Uros", 240));
		myHeap.insert(new Employee("Marko", 780));
		myHeap.insert(new Employee("Jovan", 325));
		myHeap.insert(new Employee("Petar", 441));
		myHeap.insert(new Employee("Blagoje", 150));
		myHeap.insert(new Employee("Slavko", 680));
		myHeap.insert(new Employee("Ana", 470));
		myHeap.insert(new Employee("Jovana", 900));
		
		//insert more
		myHeap.insert(new Employee("Milosav", 1200));
		myHeap.insert(new Employee("Teodora", 380));
		myHeap.insert(new Employee("Ivana", 350));
		myHeap.insert(new Employee("Una", 400));
	}
//	-----------------------------------------------------------
	//fill my myHeap
	public void fillBookHeap(HeapFromBook bookHeap) {
		bookHeap.insert(new Employee("Uros", 240));
		bookHeap.insert(new Employee("Marko", 780));
		bookHeap.insert(new Employee("Jovan", 325));
		bookHeap.insert(new Employee("Petar", 441));
		bookHeap.insert(new Employee("Blagoje", 150));
		bookHeap.insert(new Employee("Slavko", 680));
		bookHeap.insert(new Employee("Ana", 470));
		bookHeap.insert(new Employee("Jovana", 900));
		
		//insert more
		bookHeap.insert(new Employee("Milosav", 1200));
		bookHeap.insert(new Employee("Teodora", 380));
		bookHeap.insert(new Employee("Ivana", 350));
		bookHeap.insert(new Employee("Una", 400));
	}
//	-----------------------------------------------------------
	public static void main(String[] args) {
		
		TestHeap test=new TestHeap();
		
		Heap myHeap = new Heap(50);
		HeapFromBook bookHeap = new HeapFromBook(50);
		test.fillMyHeap(myHeap);
		test.fillBookHeap(bookHeap);
		
		System.out.println("My Heap: ");
		myHeap.displayHeap();
		System.out.println();
		
		System.out.println("Book Heap: ");
		bookHeap.displayHeap();
		System.out.println();
		
		//testing delete
		System.out.println("Deleting .................");
		myHeap.remove();
		bookHeap.remove();
		System.out.println("My Heap: ");
		myHeap.displayHeap();
		System.out.println();
		System.out.println("Book Heap: ");
		bookHeap.displayHeap();
		System.out.println();
		
		System.out.println("Deleting .................");
		myHeap.remove();
		bookHeap.remove();
		System.out.println("My Heap: ");
		myHeap.displayHeap();
		System.out.println();
		System.out.println("Book Heap: ");
		bookHeap.displayHeap();
		System.out.println();
	}

}

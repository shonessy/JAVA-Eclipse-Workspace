
public class TestPriorityQueue {

//	-----------------------------------------------------------
	//fill my priorityQueue
	public void fillpriorityQueue(Queue priorityQueue) {
		priorityQueue.insert(new Employee("Uros", 240));
		priorityQueue.insert(new Employee("Marko", 780));
		priorityQueue.insert(new Employee("Jovan", 325));
		priorityQueue.insert(new Employee("Petar", 441));
		priorityQueue.insert(new Employee("Blagoje", 150));
		priorityQueue.insert(new Employee("Slavko", 680));
		priorityQueue.insert(new Employee("Ana", 470));
		priorityQueue.insert(new Employee("Jovana", 900));
		
		//insert more
		priorityQueue.insert(new Employee("Milosav", 1200));
		priorityQueue.insert(new Employee("Teodora", 380));
		priorityQueue.insert(new Employee("Ivana", 350));
		priorityQueue.insert(new Employee("Una", 400));
	}
//	-----------------------------------------------------------
	
	public static void main(String[] args) {
		TestPriorityQueue tpq = new TestPriorityQueue();
		Queue priorityQueue=new Queue(50);
		tpq.fillpriorityQueue(priorityQueue);
		
		System.out.println("Priority Queue: ");
		priorityQueue.displayQueue();
		System.out.println("queue: " + priorityQueue);
		

	}

}

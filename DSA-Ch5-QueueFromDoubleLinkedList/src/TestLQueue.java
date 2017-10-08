
public class TestLQueue {

	public static void main(String[] args) {
		LQueue queue = new LQueue();
		
		queue.insert(new Link("Milos", 54_100));
		queue.insert(new Link("Uros", 13_100));
		queue.insert(new Link("Jovan", 22_300));
		queue.insert(new Link("Petar", 154_700));
		queue.insert(new Link("Srdjan", 53_125));
		System.out.println("Queue: " + queue);
		
		System.out.println("Insert Jovana " );
		queue.insert(new Link("Jovana", 12_125));
		System.out.println("Queue: " + queue);
		
		System.out.println("remove(): " + queue.remove());
		System.out.println("Queue: " + queue);
		
		System.out.println("peek(): " + queue.peek());

	}

}


public class TestQueue {
	
	public static void main(String args[]){
		GenericQueue<Integer> queue = new GenericQueue<>(10);
		for(int i=0; i<5; i++)
			if(!queue.isFull())
				queue.insert((int)(Math.random()*100));
		System.out.println("Queue: \n\t" + queue);
		
		queue.insert(54);
		System.out.println("Insert 54: \n\t" + queue);
		
		if(!queue.isEmpty())
			queue.remove();
		if(!queue.isEmpty())
			queue.remove();
		if(!queue.isEmpty())
			queue.remove();
		System.out.println("Removed 3: \n\t" + queue);
		
		for(int i=0; i<60; i++)
			if(!queue.isFull())
				queue.insert((int)(Math.random()*100));
		System.out.println("Queue: \n\t" + queue);
		
		System.out.println("\nInsert 10_000, no test:");
		queue.insert(10_000);
		System.out.println("\t" + queue);
		
		System.out.println("\nInsert 11_000, no test:");
		queue.insert(11_000);
		System.out.println("\t" + queue);
		
		System.out.println("\nInsert 12_000, test:");
		if(!queue.isFull())
			queue.insert(12_000);
		System.out.println("\t" + queue);
		
		System.out.println("\nInsert 13_000, test:");
		if(!queue.isFull())
			queue.insert(13_000);
		System.out.println("\t" + queue);
		
		System.out.println("isFull(): " + queue.isFull());
		
		if(!queue.isEmpty())
			queue.remove();
		if(!queue.isEmpty())
			queue.remove();
		if(!queue.isEmpty())
			queue.remove();
		System.out.println("Removed 3: \n\t" + queue);
		
	}
}


public class QueueDemo {

	public static void main(String[] args) {
		Queue bigQ=new Queue(100);
		Queue smallQ=new Queue(4);
		char c;
		
		System.out.println("Putting alphabet in bigQ: ");
		for(int i=0;i<26;i++)
			bigQ.put( (char) ('A' + i) );
		
		System.out.print("Content of bigQ: ");
		while( (c=bigQ.get()) !=0  )
			System.out.print(c + " ");

		
		
	}

}

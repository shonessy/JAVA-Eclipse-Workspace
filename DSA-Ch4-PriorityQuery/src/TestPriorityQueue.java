
public class TestPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue pQ = new PriorityQueue(10);
		try{
			for(int i=0; i<6; i++){
				int x=(int)(Math.random()*100);
				pQ.insert(x);
				System.out.print("Rand: " + x + ", ");
			}
			System.out.println();
			System.out.println("Inserting 6 elements: " + pQ);
			
			System.out.print("Inseting 10_000 element: ");
			pQ.insert(10_000);
			System.out.println(pQ);	
			
			System.out.print("Inseting 11_000 element: ");
			pQ.insert(11_000);
			System.out.println(pQ);	
			
			System.out.print("Inseting 8_000 element: ");
			pQ.insert(8_000);
			System.out.println(pQ);	
			
			System.out.print("Inseting 1_000 element: ");
			pQ.insert(1_000);
			System.out.println(pQ);	
			
			/*System.out.print("Inseting 54_000 element: ");
			pQ.insert(54_000);
			System.out.println(pQ);	*/		// exception
			
			System.out.print("remove(): ");
			pQ.remove();
			System.out.println(pQ);	
			
			System.out.print("remove(): ");
			pQ.remove();
			System.out.println(pQ);	
			
			System.out.println("Remove 7: ");
			for(int i=0; i<7; i++)
				pQ.remove();
			System.out.println(pQ);
			
			System.out.print("remove(): ");
			pQ.remove();
			System.out.println(pQ);	
			
			/*System.out.print("remove(): ");
			pQ.remove();
			System.out.println(pQ);	*/		//exception
			
		}catch(PriorityQueueFullException e){
			System.out.println(e);
		}catch(PriorityQueueEmptyException e){
			System.out.println(e);
		}
		

	}

}

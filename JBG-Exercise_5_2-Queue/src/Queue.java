
public class Queue {
	char queue[];	// holds queue
	int putloc, getloc;
	
	Queue(int size){
		queue=new char[size];
		putloc=getloc=0;
		}

	void put(char c){
		if(putloc>=queue.length){
			System.out.println("Queue is FULL.");
			return;
			}
		else
			queue[putloc++]=c;
		}
	
	char get(){
		if(putloc==getloc){
			System.out.println(" - Queue is EMPTY.");
			return (char) 0;
			}
		else
			return queue[getloc++];
		}
}

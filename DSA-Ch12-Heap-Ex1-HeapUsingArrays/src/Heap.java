
public class Heap {
	private Employee[] heapArray;
	private int currentSize;
	
//	---------------------------------------------------
	//constructor
	public Heap(int maxSize){
		heapArray = new Employee[maxSize];
		currentSize=0;
	}
//	---------------------------------------------------	
	//is empty
	public boolean isEmpty() {
		return (currentSize==0);
	}
//	---------------------------------------------------	
	//is full
	public boolean isFull() {
		return (currentSize==heapArray.length);
	}
//	---------------------------------------------------	
	public boolean insert(Employee employe) {
		if(this.isFull())
			return false;
		heapArray[currentSize]=employe;
		this.trickleUp(currentSize);
		currentSize++;
		return true;
	}
//	---------------------------------------------------		
	//trickle up
	public void trickleUp(int index) {
		int parentIndex=(index-1)/2;
		Employee temp=heapArray[index];
		while(index > 0 &&
			  temp.getSalary() > heapArray[parentIndex].getSalary() ){
			heapArray[index]=heapArray[parentIndex];
			index=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		heapArray[index]=temp;
	}
//	---------------------------------------------------
	//remove (root)
	public Employee remove(){
		Employee temp=heapArray[0];
		heapArray[0]=heapArray[currentSize-1];
		currentSize--;
		trickleDown(0);
		return temp;
	}
//	---------------------------------------------------	
	//tricke down
	public void trickleDown(int index) {
		Employee temp=heapArray[index];
		int largerChildIndex=index;
		while(true){
			int leftChildIndex=2*index+1;
			if(leftChildIndex>=currentSize)
				break;
			int rightChildIndex=leftChildIndex + 1;
			
			if(heapArray[leftChildIndex].getSalary() > 
			   heapArray[rightChildIndex].getSalary() )
				largerChildIndex=leftChildIndex;
			else if(rightChildIndex<currentSize)
				largerChildIndex=rightChildIndex;
			
			if(heapArray[largerChildIndex].getSalary() < temp.getSalary())
				break;
			heapArray[index]=heapArray[largerChildIndex];
			index=largerChildIndex;
		}//while
		heapArray[index]=temp;
	}
//	---------------------------------------------------	
	 public void displayHeap()
     {
     System.out.print("heapArray: ");    // array format
     for(int m=0; m<currentSize; m++)
        if(heapArray[m] != null)
           System.out.print( heapArray[m] + " ");
        else
           System.out.print( "-- ");
     System.out.println();
                                         // heap format
     int nBlanks = 32;
     int itemsPerRow = 1;
     int column = 0;
     int j = 0;                          // current item
     String dots = "...............................";
     System.out.println(dots+dots);      // dotted top line

     while(currentSize > 0)              // for each heap item
        {
        if(column == 0)                  // first item in row?
           for(int k=0; k<nBlanks; k++)  // preceding blanks
              System.out.print(' ');
                                         // display item
        System.out.print(heapArray[j]);

        if(++j == currentSize)           // done?
           break;

        if(++column==itemsPerRow)        // end of row?
           {
           nBlanks /= 2;                 // half the blanks
           itemsPerRow *= 2;             // twice the items
           column = 0;                   // start over on
           System.out.println();         //    new row
           }
        else                             // next item on row
           for(int k=0; k<nBlanks*2-2; k++)
              System.out.print(' ');     // interim blanks
        }  // end for
     System.out.println("\n"+dots+dots); // dotted bottom line
     }  // end displayHeap()
//-------------------------------------------------------------
}

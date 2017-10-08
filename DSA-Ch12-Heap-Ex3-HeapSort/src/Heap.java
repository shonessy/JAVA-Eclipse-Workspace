
public class Heap  {
	private Integer[] heapArray;
	private int currentSize;
	
//	---------------------------------------------------
	//constructor
	public Heap(int maxSize){
		heapArray =  new Integer[maxSize];
		currentSize=0;
	}
//	---------------------------------------------------	
	//get current size
	public int getCurrentSize() {
		return currentSize;
	}
//	---------------------------------------------------
	//increment current size
	public void incrementCurrentSize() {
		currentSize++;
	}
//	---------------------------------------------------	
	//decrement current size
	public void decrementCurrentSize() {
		currentSize--;
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
	//insert at
	public void insertAt(int index, int element) {
		heapArray[index]=element;
	}
//	---------------------------------------------------	
	public boolean insert(int element) {
		if(this.isFull())
			return false;
		heapArray[currentSize]=element;
		this.trickleUp(currentSize);
		currentSize++;
		return true;
	}
//	---------------------------------------------------		
	//trickle up
	public void trickleUp(int index) {
		int parentIndex=(index-1)/2;
		int temp=heapArray[index];
		while(index > 0 && temp > heapArray[parentIndex]){
			heapArray[index]=heapArray[parentIndex];
			index=parentIndex;
			parentIndex=(parentIndex-1)/2;
		}
		heapArray[index]=temp;
	}
//	---------------------------------------------------
	//remove (root)
	public int remove(){
		int temp=heapArray[0];
		heapArray[0]=heapArray[currentSize-1];
		currentSize--;
		trickleDown(0);
		return temp;
	}
//	---------------------------------------------------	
	//tricke down
	public void trickleDown(int index) {
		int temp=heapArray[index];
		int largerChildIndex=index;
		while(true){
			int leftChildIndex=2*index+1;
			if(leftChildIndex>=currentSize )
				break;
			int rightChildIndex=leftChildIndex + 1;
			
			if(rightChildIndex >= currentSize || 							//no right child
					heapArray[leftChildIndex] > heapArray[rightChildIndex]) //bouth children, left bigger		
				largerChildIndex=leftChildIndex;
			else 															//bouth children, right bigger
				largerChildIndex=rightChildIndex;		
			
			if(temp >= heapArray[largerChildIndex] )
				break;
			heapArray[index]=heapArray[largerChildIndex];
			index=largerChildIndex;
		}//while
		heapArray[index]=temp;
	}
//	---------------------------------------------------		
	//to string
	@Override
	public String toString(){
		String ret="";   
	     for(int m=0; m<currentSize; m++)
	        if(heapArray[m] != null)
	           ret+=heapArray[m] + " ";
	     return ret;
	}
//	---------------------------------------------------	
	//heap array to String
	public String heapArray2String(){
		String ret="";
		for(int i=heapArray.length-1; i>=0; i--)
			ret+=heapArray[i] + ", ";
		return ret;
	}
//	---------------------------------------------------	
	 public void displayHeap()
     {
		 
	 // array format
	 System.out.print("heapArray: ");   
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

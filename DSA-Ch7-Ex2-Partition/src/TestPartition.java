
public class TestPartition {
	
	private static int arr[];
	
	//-------------------------------------------------//
	//constructor
	public TestPartition(int n){
		arr=new int[n];
	}
	//-------------------------------------------------//
	//swap
	public void swap(int n1, int n2, int arr[]) {
		int temp=arr[n1];
		arr[n1]=arr[n2];
		arr[n2]=temp;
	}
	//-------------------------------------------------//
	//to string
	public String arr2Str(int arr[]) {
		String ret="\n\t";
		for(int x : arr)
			ret+=x + ", ";
		return ret;
	}
	//-------------------------------------------------//
	//copy array
	public int[] copyArray(int from[]){
		int ret[]=new int[from.length];
		for(int i=0; i<from.length; i++)
			ret[i]=from[i];
		return ret;
	}
	//-------------------------------------------------//
	//get mean
	public int getMean() {
		int sum=0;
		for(int x : arr)
			sum+=x;
		return sum/arr.length;
	}
	//-------------------------------------------------//
	//partition
	public int partition(int leftLimit, int rightLimit, int pivot, int arr[]) {
		int left=leftLimit;
		int right=rightLimit-1;
		partition: while(true){
			while(left<right && arr[left]<pivot )		//find first bigger then pivot
				left++;
			while(right>left && arr[right]>pivot )				//find first smaller then pivot
				right--;
			if(left>=right)
				break partition;
			else
				swap(left, right, arr);
		}
		return left;
	}
	//-------------------------------------------------//
	//partition book
	public int partitionBook(int left, int right, long pivot, int arr[])
    {
    int leftPtr = left - 1;           // right of first elem
    int rightPtr = right + 1;         // left of pivot
    while(true)
       {
       while(leftPtr < right &&       // find bigger item
             arr[++leftPtr] < pivot)
          ;  // (nop)

       while(rightPtr > left &&       // find smaller item
             arr[--rightPtr] > pivot)
          ;  // (nop)
       if(leftPtr >= rightPtr)        // if pointers cross,
          break;                      //    partition done
       else                           // not crossed, so
          swap(leftPtr, rightPtr, arr);    //    swap elements
       }  // end while(true)
    return leftPtr;                   // return partition
    }  // end partitionIt()
	//-------------------------------------------------//
	
	
	
	//-------------------------------------------------//
	public static void main(String[] args) {
		TestPartition tp=new TestPartition(10);
		for(int i=0; i<arr.length; i++)
			arr[i]=(int)(Math.random()*100);
		System.out.println("Niz: " + tp.arr2Str(arr));
		
		int arrCopy[]=tp.copyArray(arr);	
		System.out.println("Niz Copy: " + tp.arr2Str(arrCopy));
		
		int pivot=tp.getMean()+10;
		System.out.println("Pivot: " + pivot + "\n");
		
		int point=tp.partition(0, arr.length, pivot, arr);
		System.out.println("Partition: " + tp.arr2Str(arr));
		System.out.println("\tPoint: " + point);
		
		point=tp.partitionBook(0, arrCopy.length-1, pivot, arrCopy);
		System.out.println("Partition from Book: " + tp.arr2Str(arrCopy));
		System.out.println("\tPoint: " + point);
		
	}

}

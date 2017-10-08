
public class TestHeapSort {
	
	public static final int MAX_SIZE=100_000;

//	---------------------------------------------------	
	//display array
	public void displayArray(int array[]) {
		System.out.print("\t");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + ", ");
	}
//	---------------------------------------------------	
	//heap sort
	public int[] heapSort(int array[]) {
		Heap heap=new Heap(array.length);
		
		for(int i=0; i<array.length; i++)
			heap.insert(array[i]);
		
		int sorted[]=new int[array.length];
		for(int i=0; i<array.length; i++)
			sorted[i]=heap.remove();
		
		return sorted;
	}
//	---------------------------------------------------	
	//heap sort improved
	public void heapSort1(Heap heap) {
		//crating heap from random array
		for(int i=MAX_SIZE/2-1; i>=0; i--)
			heap.trickleDown(i);
		
		//transforming heap to sorted array
		for(int i=MAX_SIZE-1; i>=0; i--){
			int temp=heap.remove();
			heap.insertAt(i, temp);
		}
		
	}
//	---------------------------------------------------	
	
	//test sorting
	public boolean testSorting(int arr[]) {
		for(int i=0; i<arr.length-1; i++)
			if(arr[i+1]>arr[i])
				return false;
		return true;
	}
//	---------------------------------------------------	
	//test 2 arrays
	public boolean test2Arrays(int arr1[], Integer arr2[]) {
		if(arr1.length != arr2.length)
			return false;
		for(int i=0; i<arr1.length; i++)
			if(arr1[i] != arr2[i])
				return false;
		return true;
					
	}
//	---------------------------------------------------	
	//array 2 String
	public String arrayToString(int array[]) {
		String ret="";
		for(int x : array)
			ret+=x + ", ";
		return ret;
	}
//	---------------------------------------------------
	public static void main(String args[]) {
		TestHeapSort ths=new TestHeapSort();
		Heap heap=new Heap(MAX_SIZE);
		int unsorted[]=new int [MAX_SIZE];
		int sorted[] =new int[MAX_SIZE];
		
		for(int i=0; i<MAX_SIZE; i++){
			unsorted[i]=(int)(Math.random()*MAX_SIZE*10);
			heap.insertAt(i, unsorted[i]);
			heap.incrementCurrentSize();
		}
		
		//System.out.println("Unsorted: ");
		//ths.displayArray(unsorted);
		//System.out.println();
		//System.out.println("Heap: " + heap);
		//System.out.println("Sorted Well: " + ths.testSorting(unsorted));
		//System.out.println();
		
		System.out.println("Sorted: ");
		long start=System.nanoTime();
		sorted=ths.heapSort(unsorted);		
		long stop=System.nanoTime();
		//ths.displayArray(sorted);
		//System.out.println();
		System.out.println("Sorted Well: " + ths.testSorting(sorted));
		System.out.println("Time: " + (stop-start)/1_000_000 + "[ms]");
		System.out.println();
		
		//improved heap sort
		System.out.println("Improved Heap Sort: ");
		start=System.nanoTime();
		ths.heapSort1(heap);
		stop=System.nanoTime();
		//System.out.println("Sorted Heap: " + heap.heapArray2String());
		System.out.println("Time: " + (stop-start)/1_000_000 + "[ms]");
		System.out.println();
		
		//System.out.println("Same results from both: " + 
		//					ths.arrayToString(sorted).equals(
		//							heap.heapArray2String())	);
		
		
	}
}

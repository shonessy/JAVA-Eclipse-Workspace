
public class TestQuickSort {

	private static int arr[];
	
	//-------------------------------------------------//
	//Constructor
	public TestQuickSort(int n){
		arr=new int[n];
	}
	//-------------------------------------------------//
	//swap
	public void swap(int n1, int n2/*, int arr[]*/) {
		int temp=arr[n1];
		arr[n1]=arr[n2];
		arr[n2]=temp;
	}
	//-------------------------------------------------//
	//to string
	public String arr2Str(/*int arr[]*/) {
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
	//display array
	public void displayArray(/*int arr[]*/) {
		System.out.print("\t");
		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();
	}
	//-------------------------------------------------//
	//partition
	public int partition(int leftLimit, int rightLimit, int pivot/*, int arr[]*/){
		int left=leftLimit;
		int right=rightLimit-1;
		while(true){
			while(left<right && arr[left]<pivot)
				left++;
			while(right>left && arr[right]>pivot)
				right--;
			if(left>=right)
				break;
			else
				swap(left, right/*, arr*/);
		}
		//swap(rightLimit-1, left, arr);		//ne treba swap, algoritam to vec radi 
												//?
		return left;
	}
	//-------------------------------------------------//
	//quick sort
	public void quickSort(/*int arr[]*/){
		recursiveQuickSort(0, arr.length/*, arr*/);
	}
	//-------------------------------------------------//
	//recursive quick sort
	public void recursiveQuickSort(int left, int right/*, int arr[]*/) {
		if(left>=right)									//if length(partition)==1
			return;
		int pivot=arr[right-1];
		int middle=partition(left, right, pivot/*, arr*/);
		//swap(middle, right-1, arr);
		recursiveQuickSort(left, middle/*, arr*/);
		recursiveQuickSort(middle+1, right/*, arr*/);
	}
	//-------------------------------------------------//
	
	
	//-------------------------------------------------//
	public static void main(String[] args) {
		//TestQuickSort tqs=new TestQuickSort(10_000);
		//int arr[]=new int[470];
		int test=0;
		long avgTime=0;
		while(test<10){
		
		TestQuickSort tqs=new TestQuickSort(10_000);
		for(int i=0; i<arr.length; i++)
			arr[i]=(int)(Math.random()*1_000_000_000);
		//System.out.println("Niz: " + tqs.arr2Str(arr));
		//System.out.println("Niz: ");
		//tqs.displayArray(/*arr*/);
		
		/*												//testiranje swap-a
		int pivot=arr[arr.length-1];
		int middle=tqs.partition(0, arr.length, pivot, arr);
		System.out.println("Pivot: " + pivot + "  Middle position: " + middle);
		System.out;.println("Partition" + tqs.arr2Str(arr));
		*/
		
		long start=System.nanoTime();
		tqs.quickSort(/*arr*/);
		long stop=System.nanoTime();
		//System.out.println("Sortirani Niz: " + tqs.arr2Str(arr));
		//System.out.println("Sortirani Niz: ");
		//tqs.displayArray(/*arr*/);
		//System.out.printf("\tTime: %d[us]\n", (stop-start)/1_000);
		
		avgTime+=(stop-start);
		test++;
		
		}
		System.out.printf("\tAverage Time: %d[us]\n", (avgTime/test)/1_000);
	}

}


public class TestShellSort {
	
	
	//--------------------------------------------//
	//insertion sort
	public void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++){
			int temp=arr[i];
			int k=i;
			while(k>0 && arr[k-1]>=temp)
				arr[k]=arr[--k];
			arr[k]=temp;
		}
	}
	//--------------------------------------------//
	//shellSort
	public void shellSort(int arr[]){
		int h=1;						//base case
		while(h<=arr.length/3)
			h=3*h+1;
		
		while(h>=1){
			for(int i=h; i<arr.length; i++){
				int temp=arr[i];
				int k=i;
				while(k>h-1 && arr[k-h]>temp){
					arr[k]=arr[k-h];
					k-=h;
				}
				arr[k]=temp;
					
			}
			h=(h-1)/3;
		}
	}	
	//--------------------------------------------//
	//print array
	public String arr2Str(int a[]) {
		String ret="\n\t";
		for(int x : a)
			ret+=x + " ";
		return ret;
	}
	//--------------------------------------------//
	//copy array
	public void copyArray(int from[], int to[]){
		if(from.length!=to.length){
			System.out.println("Greska: nizovi nisu iste duzine"); return;
			}
		for(int i=0; i<from.length; i++)
			to[i]=from[i];
	}
	//--------------------------------------------//
	//compare arrays
	public boolean	compareArrays(int a[], int b[]) {
		if(a.length!=b.length)
			return false;
		for(int i=0; i<a.length; i++)
			if(a[i]!=b[i])
				return false;
		return true;
	}
	//--------------------------------------------//
	public static void main(String[] args) {
		TestShellSort ts = new TestShellSort();
		int niz[]=new int [100_000];
		for(int i=0; i<niz.length; i++)
			niz[i]=(int)(Math.random()*niz.length*10);
		//System.out.println("Nesortirani niz: " + ts.arr2Str(niz));
		
		//insertion sort
		int insertionSorted[]=new int[niz.length];
		ts.copyArray(niz, insertionSorted);
		long start=System.nanoTime();
		ts.insertionSort(insertionSorted);
		long stop=System.nanoTime();
		System.out.println("Insertion Sorted: " + (stop-start)/1_000_000 + "[ms]");
		//System.out.println("Insertion Sorted: " + ts.arr2Str(insertionSorted));
		
		int shellSorted[]=new int[niz.length];
		ts.copyArray(niz, shellSorted);
		start=System.nanoTime();
		ts.shellSort(shellSorted);
		stop=System.nanoTime();
		System.out.println("Shell Sorted: " + (stop-start)/1_000_000 + "[ms]");
		//System.out.println("Shell Sorted: " + ts.arr2Str(shellSorted));
		
		System.out.println("Insertion==Shell: " + ts.compareArrays(insertionSorted, shellSorted));

	}

}

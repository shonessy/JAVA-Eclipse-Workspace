
public class BubbleSort {
	private int[] array;
	private int length;
	
	//--------------------------------------------//
	public BubbleSort(int n){
		array=new int[n];
		length=0;
	}
	//--------------------------------------------//
	public BubbleSort(BubbleSort bs){
		this.length=bs.length;
		this.array=new int[this.length];
		for(int i=0; i<this.length; i++)
			this.array[i]=bs.array[i];
	}
	//--------------------------------------------//
	public void insert(int x) {
		array[length++]=x;
	}
	//--------------------------------------------//
	public int getLength() {
		return length;
	}
	//--------------------------------------------//	
	public void swap(int a, int b){
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
	//--------------------------------------------//
	public void bubbleSort(){
		for(int i=this.length-1; i>=2; i--)
			for(int j=0; j<i; j++)
				if(array[j]>array[j+1])
					this.swap(j, j+1);
	}
	//--------------------------------------------//
	public void selectionSort() {
		
		for(int i=0; i<array.length; i++){
			int minPos=i;
			for(int j=i+1; j<array.length; j++)
				if(array[j]<array[minPos])
					minPos=j;
			if(i!=minPos)
				swap(i, minPos);
		}
	}
	//--------------------------------------------//
	public void insertionSort(){
		for(int i=1; i<this.length; i++){
			int temp=array[i];
			int j=i-1;
			while(j>=0 && array[j]>temp){
				array[j+1]=array[j--];
				//j--;
			}
			array[j+1]=temp;
		}
	}
	//--------------------------------------------//
	public int[] copyArray(){
		int[] arrayCopy = new int[array.length];
		for(int i=0; i<array.length; i++)
			arrayCopy[i]=array[i];
		return arrayCopy;
	}
	//--------------------------------------------//
	@Override
	public String toString(){
		String ret="\n\t";
		for(int i=0;i<length; i++)
			ret+=array[i] + ", ";
		return ret;
	}
	//--------------------------------------------//
	
}

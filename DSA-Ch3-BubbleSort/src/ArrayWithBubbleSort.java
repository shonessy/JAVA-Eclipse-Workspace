
public class ArrayWithBubbleSort {
	
	private int array[];
	private int length;
	
	//-------------------------------------------//
	//constructor
	public ArrayWithBubbleSort(int max){
		array=new int[max];
		length=0;
	}
	//-------------------------------------------//
	//insert
	public void insert(int element){
		array[length]=element;
		length++;
	}
	//-------------------------------------------//
	//get size
	public int length(){
		return length;
	}
	//-------------------------------------------//
	//bubble sort
	public void bubbleSort(){
		for(int i=length-1; i>0; i--)			//pravilnije i>1
			for(int j=0; j<i; j++)
				if(array[j]>array[j+1])
					swap(j, j+1);
	}
	//-------------------------------------------//
	//biderctioanal bubble sort - coctail sort
	public void bidirBubbleSort(){
		for(int i=1; i<length/2; i++){
			for(int j=0; j<length-i; j++)
				if(array[j]>array[j+1])
					swap(j, j+1);
			for(int j=length-i; j>=i; j--)
				if(array[j]<array[j-1])
					swap(j, j-1);
		}
	}
	//-------------------------------------------//
	//odd-even sort
	public void oddEvenSort(){
		boolean isSorted=false;
		
		while(!isSorted){
			isSorted=true;
			for(int j=1; j<length-1; j+=2)
				if(array[j]>array[j+1]){
					swap(j, j+1);
					isSorted=false;
				}
			for(int j=0; j<length-1; j+=2)
				if(array[j]>array[j+1]){
					swap(j, j+1);
					isSorted=false;
				}
		}
	}
	//-------------------------------------------//
	//selection Sort
	public void selectionSort(){
		for(int i=0; i<length; i++){			//pravilnije i<length-1
			int min=i;
			for(int j=i+1; j<length; j++)
				if(array[j]<array[min])
					min=j;
			if(min!=i)
				swap(i, min);
		}
	}	
	//-------------------------------------------//
	//Insertion sort
	public void insertionSort(){
		for(int i=1; i<length; i++){			//moramo imati partial sort na levoj strani, pa neka to bude array[0]   
			int temp=array[i];
			int j=i;
			while(j>0 && array[j-1]>temp){		//stable >=
				//swap(j, j-1);					//nikako swap jer gubimo brzinu koju dobijama sa copy
				array[j]=array[j-1];
				j--;
			}
			array[j]=temp;
		}
	}
	//-------------------------------------------//
	//swap 2 elements
	public void swap(int index1, int index2){
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	//-------------------------------------------//
	//toString
	@Override
	public String toString(){
		String ret="";
		for(int i=0; i<length; i++)
			ret+=array[i] + ", ";
		return ret;
	}
	//-------------------------------------------//
	//copy array
	public void copyArray(ArrayWithBubbleSort orig){
		for(int i=0; i<orig.length(); i++)
			//this.array[i]=orig.array[i];
			this.insert(orig.array[i]);
	}
	//-------------------------------------------//
	//test equality of two arrays
	public boolean areEqual(ArrayWithBubbleSort x){
		if(this.length != x.length)
			return false;
		for(int i=0; i<x.length; i++)
			if(this.array[i] != x.array[i])
				return false;
		return true;
	}
	
	//-------------------------------------------//
	//median
	public int median(boolean isArraySorted){
		if(!isArraySorted)
			this.insertionSort();
		return this.array[(int)Math.floor((this.length-1)/2)];
	}
	//-------------------------------------------//
	//
	public void noDups(){
		int tempArray[]=new int[array.length];
		int tempLength=0;
		for(int i=0; i<length-1; i++)
			if(array[i] != array[i+1])
				tempArray[tempLength++]=array[i];
		array=tempArray;
		length=tempLength;
	}
	//-------------------------------------------//

	
}

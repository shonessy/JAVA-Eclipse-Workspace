
public class OrderedArray {
	
	private int array[]=null;
	private int length;
	
	//---------------------------------------//
	//constructor
	public OrderedArray(int max){
		array = new int[max];
		length=0;
	}
	//---------------------------------------//
	//getSize
	public int length(){
		return length;
	}
	//---------------------------------------//
	//get element
	public int getElement(int index){
		return array[index];
	}
	//---------------------------------------//
	//add element
	public void insert(int e){
		int pos=length;						//ako ne nadjemo gdje, ubacimo na kraj
		for(int i=0; i<length; i++)
			if(e<array[i]){
				pos=i;
				break;
			}
		for(int i=length; i>pos; i--)
			array[i]=array[i-1];
		array[pos]=e;
		length++;
	}
	//---------------------------------------//
	//delete element
	public int delete(int e){
		int pos=find(e);
		if(pos>=0){
			for(int i=pos; i<length; i++)
				array[i]=array[i+1];
			length--;
			return pos;
		}
		return -1;
	}
	//---------------------------------------//
	//find element - binary search
	public int find(int e){
		int lowBound=0;
		int upBound=length-1;
		while(lowBound<=upBound){
			int middle=(lowBound+upBound)/2;
			if(array[middle]>e)
				upBound=middle - 1;
			else if(array[middle]<e)
				lowBound=middle + 1;
			else
				return middle;
		}
		return -1;
	}
	//---------------------------------------//
	//getmax
	public int getMax(){
		return (length==0) ? -1 : array[length-1];
	}
	//---------------------------------------//
	//remove max
	public int removeMax(){
		return delete(array[length-1]);
	}
	//---------------------------------------//
	//merge
	public OrderedArray merge(OrderedArray arr){
		OrderedArray result = new OrderedArray(2*(this.length + arr.length));
		for(int i=0; i<this.length; i++)
			result.insert(this.getElement(i));
		for(int i=0; i<arr.length; i++)
			result.insert(arr.getElement(i));
		return result;
		
	}
	//---------------------------------------//
	//toString
	@Override
	public String toString(){
		String s="";
		for(int i=0; i<length; i++)
			s+=array[i] + ", ";
		return s;
	}
	//---------------------------------------//

}

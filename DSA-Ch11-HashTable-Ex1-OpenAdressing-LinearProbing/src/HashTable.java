/*
 * Employee's salary is key for hashing
 */

public class HashTable {
	private Employee data[];
	private Employee dellElement;				//marking deleted element
	//private int arraySize;
	
//	------------------------------------------------------
	//constructor
	public HashTable(int arraySize) {
		//this.arraySize=arraySize;
		data=new Employee[arraySize];
		dellElement=new Employee("null", -1);
	}
//	------------------------------------------------------
	//get data item
	public Employee getDataItem(int index) {
		return data[index];
	}
//	------------------------------------------------------
	//get array size
	public int getArraySize() {
		return data.length;
	}
//	------------------------------------------------------
	//hash function
	public int hashFunc(int key) {
		return key % data.length;
	}
//	------------------------------------------------------
	//find
	public Employee find(int key) {
		int index=this.hashFunc(key);
		while(this.data[index] != null && index<this.data.length){
			if(key == this.data[index].getSalary())
				return this.data[index];
			index++;
		}
		return null;
	}
//	------------------------------------------------------
	//insert
	public void insert(Employee employee) {
		int index=this.hashFunc(employee.getSalary());
		while(this.data[index] != null &&
			  this.data[index].getSalary() != -1 )
			index++;
		
		if(index>=this.data.length)
			return ;
		this.data[index]=employee;
	}
//	------------------------------------------------------
	//delete element
	public Employee delete(int key) {
		int index=this.hashFunc(key);
		while(this.data[index] != null && index<this.data.length){
			if(this.data[index].getSalary() == key){
				Employee temp=this.data[index];
				this.data[index]=dellElement;
				return temp;
			}
			index++;
		}
		return null;
	}
//	------------------------------------------------------
	//to string
	@Override
	public String toString(){
		String ret="";
		int n=0;
		for(Employee x : data)
			ret+=(n++) + "." + x + ", ";
		return ret;
	}
//	------------------------------------------------------
		
}

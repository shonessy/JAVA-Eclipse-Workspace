import java.util.LinkedList;

public class HashTable {
	private LinkedList<Employee> dataList[];
	
//	---------------------------------------------------
	//constructor
	public HashTable(int size){
		dataList=new LinkedList[size];
		for(int i=0; i<size; i++)
			dataList[i]=new LinkedList<Employee>();
	}
//	---------------------------------------------------
	//primary hash function
	public int hashFunc1(int key) {
		return key % dataList.length;
	}
//	---------------------------------------------------
	//find by key
	public Employee find(int key) {
		int index=hashFunc1(key);
		for(Employee x : dataList[index])
			if(x.getSalary() == key)
				return x;
		return null;
	}
//	---------------------------------------------------
	//insert element at end of linked list
	public void insert(Employee employe) {
		int index=hashFunc1(employe.getSalary());
		dataList[index].add(employe);
	}
//	---------------------------------------------------
	//delete element
	public Employee delete(int key) {
		int index=hashFunc1(key);
		for(Employee x : dataList[index])
			if(x.getSalary() == key){
				Employee temp=x;
				dataList[index].remove(dataList[index].indexOf(x));
				return temp;
			}
		return null;
	}	
//	---------------------------------------------------
	//to string
	@Override
	public String toString(){
		String ret="";
		int n=0, l=0;
		for(int i=0; i<dataList.length; i++){
			ret+=n + ". => "; 
			for(Employee x : dataList[i])
				ret+= (l++) + "." + x + ", ";
			l=0;
			n++;
			ret+="\n";
		}
		return ret;
	}
//	------------------------------------------------------

}
	
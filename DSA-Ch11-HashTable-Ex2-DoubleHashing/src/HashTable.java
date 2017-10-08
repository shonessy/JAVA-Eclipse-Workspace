
public class HashTable {
	private Employee dataArray[];
	private Employee dellElement;
	
//	---------------------------------------------------
	//constructor
	public HashTable(int size){
		int n=this.getNextPrime(size);
		dataArray=new Employee[n];
		dellElement=new Employee("Null", -1);
		System.out.println("Created array of size: " + n );
	}
//	---------------------------------------------------
	//is prime
	public boolean isPrime(int n) {
		if(n==2)
			return true;
		for(int i=2; i<=Math.sqrt(n); i+=1)
			if(n%2==0 || n%i==0)
				return false;
		return true;
	}
//	---------------------------------------------------
	//get next prime
	public int getNextPrime(int n){
		while(!this.isPrime(n))
			n++;
		return n;
	}
//	---------------------------------------------------
	//get data item
	public Employee getDataItem(int index){
		return dataArray[index];
	}
//	---------------------------------------------------
	//primary hash function
	public int hashFunc1(int key) {
		return key % dataArray.length;
	}
//	---------------------------------------------------
	//secondary hash function
	public int hashfunc2(int key) {
		return 5 - (key % 5);
	}
//	---------------------------------------------------
	//find by key
	public Employee find(int key) {
		int index=hashFunc1(key);
		int step =hashfunc2(key);
		while(dataArray[index] != null && index<dataArray.length)
			if(dataArray[index].getSalary() == key)
				return dataArray[index];
			index+=step;
		return null;
	}
//	---------------------------------------------------
	//insert element 
	public void insert(Employee employe) {
		int index=hashFunc1(employe.getSalary());
		int step =hashfunc2(employe.getSalary());
		
		while(dataArray[index] != null && 
				dataArray[index].getSalary() != dellElement.getSalary())
			index+=step;
		if(index>=dataArray.length)
			return;
		dataArray[index]=employe;
	}
//	---------------------------------------------------
	//delete element
	public Employee delete(int key) {
		int index=hashFunc1(key);
		int step =hashfunc2(key);
		
		while(dataArray[index] != null && index<dataArray.length){
			if(dataArray[index].getSalary() == key){
				Employee temp=dataArray[index];
				dataArray[index]=dellElement;
				return temp;
			}
			index+=step;
		}
		return null;	
	}	
//	---------------------------------------------------
	//to string
	@Override
	public String toString(){
		String ret="";
		int n=0;
		for(Employee x : dataArray)
			ret+=(n++) + "." + x + ", ";
		return ret;
	}
//	------------------------------------------------------

}
	
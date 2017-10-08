package snippet;

public class GenericClass<T> {
	T tObj;
	
	//constructor
	public GenericClass(T obj){
		this.tObj=obj;
	}
	
	//getT
	public T getT(){
		return tObj;
	}
	
	//showType
	public void showType(){
		System.out.println("Type of T is: " + 
						    tObj.getClass().getName());
	}
	

}

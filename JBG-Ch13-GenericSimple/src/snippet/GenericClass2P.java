package snippet;
/*
 * Posto extend Number znamo da ce i T i V imati intValue() i doubleValue() metode
 */
public class GenericClass2P <T extends Number, V extends Number> {
	T tObj;
	V vObj;
	
	//Constructor
	public GenericClass2P(T tObj, V vObj){
		this.tObj=tObj;
		this.vObj=vObj;
	}
	
	//getT
	public T getT(){
		return tObj;
	}
	
	//getV
	public V getV(){
		return vObj;
	}
	
	//reciprocalT
	public double reciprocalT(){
		return 1/tObj.doubleValue();
	}
	//reciprocalV
	public double reciprocalV(){
		return 1/vObj.doubleValue();
	}
	
	//wholeT
	public int wholeT(){
		return tObj.intValue();
	}
	//wholeV
	public int wholeV(){
		return vObj.intValue();
	}
	
	//fractionT
	public double fractionT(){
		return tObj.doubleValue()-tObj.intValue();
	}
	//fractionV
	public double fractionV(){
		return vObj.doubleValue()-vObj.intValue();
	}
	
	//shovTypes
	public void shovTypes(){
		System.out.println("Type of T is: " + 
							tObj.getClass().getName());
		System.out.println("\tType of V is: " + 
							vObj.getClass().getName());
	}

}

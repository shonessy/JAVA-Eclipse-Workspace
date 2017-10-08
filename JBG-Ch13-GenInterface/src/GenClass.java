
public class GenClass <T extends Number> implements Contains<T> {
	T tObj[];
	
	//constructor
	public GenClass(T tObj[]){
		this.tObj=tObj;
	}
	
	//getTi
	public T getTi(int i){
		try{
			return tObj[i];
		}catch(IndexOutOfBoundsException e){
			System.out.println("Uneli ste ne vazeci indeks, vracam pocetni clan");
			return tObj[0];
		}
	}
	
	//contains
	public boolean contains(T mem){
		for(T x: tObj)
			if(x.equals(mem))
				return true;
		return false;
	}
}

import static java.lang.Math.abs;

public class GenNum <T extends Number> {
	T tObj;
	
	//constructoer
	public GenNum(T tObj){
		this.tObj=tObj;
	}
	
	//getT
	public T getT(){
		return tObj;
	}
	
	//showType
	public void showType(){
		System.out.println(tObj.getClass().getName());
	}
	
	//abs
	public boolean absEqual(GenNum<T> gc){
		if(abs(tObj.doubleValue())==abs(gc.getT().doubleValue()))
			return true;
		return false;
	}
	
	//abs Wildcard
	public boolean absEqualW(GenNum<?> gc){
		if(abs(tObj.doubleValue())==abs(gc.getT().doubleValue()))
			return true;
		return false;
	}
}

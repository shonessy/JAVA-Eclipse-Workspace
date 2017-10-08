
public class Test {
	

	static int devide(int x, int y) throws ResultNotIntException{
		if(x%y!=0)
			throw new ResultNotIntException(x, y);
		return x/y;
	}
	
	public static void main(String args[]){
		
		int a[]={12, 7, 4, 8, 0, 21};
		int b[]={3, 5, 4, 0, 4};
		
		for(int i=0; i<a.length; i++){
			try{
				if(a[i]%b[i]!=0)
					throw new ResultNotIntException(a[i], b[i]);
				System.out.println(a[i] + " / " + b[i] + 
								   " = " + a[i]/b[i]);
			}catch(ResultNotIntException e){
				System.out.println(e);
			}catch(ArithmeticException e){
				System.out.println("Can't devide by zero");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Not such number");
			}
		}
		
		System.out.println("---------------");
		try{
			System.out.println(devide(12, 5));
		}catch(ResultNotIntException e){
			System.out.println(e);
		}
		
	}
}

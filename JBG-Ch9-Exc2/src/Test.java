import javax.naming.spi.DirStateFactory.Result;

public class Test {
	static int a[]={7,12,0,41,5,12};
	static int b[]={4,0,7,0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Deljenje: ");
		for(int i=0; i<a.length; i++){
			try{
				System.out.print(a[i] + " / " + b[i] + " = " );
				System.out.println(a[i]/b[i]);
			}catch(ArithmeticException e){
				System.out.println("Can't devide with zero");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("No such element");
			}
		}
		
		System.out.println("\nManual throw:");
		for(int i=0; i<a.length; i++){
			try{
				if(b[i]==0)
					throw new ArithmeticException();
				System.out.print(a[i] + " / " + b[i] + " = " );
				System.out.println(a[i]/(double)b[i]);
			}catch(ArithmeticException e){
				System.out.println("Can't devide with zero");
				System.out.println("toString : " + e.toString());
				System.out.println("StackTrace : " + e.getStackTrace());
				System.out.println("Message : " + e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("No such element");
			}finally {
				System.out.println("Izasli smo iz try-a");
			}
		}
		
	}//main

}


public class Exce1 {
	static int n[]=new int[3];
	
	public static void func(int i){
		try{
			n[i]=71;
			System.out.println(n[i]);
		}catch(ArrayIndexOutOfBoundsException exc){
		System.out.println("Exception uhvacen u metodi");
		}
		
	}
}

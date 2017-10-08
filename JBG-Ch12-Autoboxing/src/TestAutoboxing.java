
public class TestAutoboxing {

	public static void main(String[] args) {
		TestAutoboxing t1=new TestAutoboxing();
		Integer n1Obj=100;
		Integer n2Obj=40;
		Integer n3Obj=new Integer(50);
		n1Obj++;
		System.out.println("n1Obj++: " + n1Obj);
		System.out.println("n1Obj+n2Obj: " + (n1Obj+n2Obj));
		int n=n2Obj-n1Obj;
		System.out.println("n: " + n);
		t1.calc(n);
		System.out.println("n nakon calc(): " + n);
		t1.calc(n2Obj);
		System.out.println("n2Obj nakon calc(): " + n2Obj);
		t1.calc(n3Obj);
		System.out.println("n3Obj nakon calc(): " + n3Obj);
		n3Obj=t1.calc(n3Obj);
		System.out.println("n3Obj nakon reasign: " + n3Obj);
	}

	int calc(int n){
		return n++;
	}
	Integer calc(Integer n){
		n++;	//Integer imutable pa se kreira novi obj n 
				//i njegova adresa je razlicita od prosledjenog n-a
		System.out.println("Iz calc(Integer): " + n);
		//return Integer.valueOf(n);
		return n;
	}
	Integer calc1(Integer n){
		Integer n1=new Integer(n++);
		n=n1;
		System.out.println("Iz calc(Integer): " + n);
		//return Integer.valueOf(n);
		return n;
	}
}


public class B extends A{
	private int k;
	
	B(int a, int b, int k){
		super(a,b);
		this.k=k;
		}
	
	void show(){
		System.out.println("k= " + k);
		}

}

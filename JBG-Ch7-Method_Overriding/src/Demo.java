
public class Demo {

	public static void main(String[] args) {
		
		A aa = new A(5,4);
		B bb =new B(7,11,9);
		
		aa.show();
		bb.show();
		aa=bb;
		aa.show();

	}

}

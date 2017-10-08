
public class ComplexNumberTest {
	
	public static void main(String[] args){
		
		ComplexNumber a=new ComplexNumber(2, 3);
		ComplexNumber b=new ComplexNumber(3, 4);
		
		ComplexNumber c1,c2;
		c1=a.add(b);
		c2=ComplexNumber.add(a, b);
		
		ComplexNumber d1,d2;
		d1=a.mult(b);
		d2=ComplexNumber.mult(a, b);
		
		System.out.println("a: " + a.toString());
		System.out.println("b: " + b.toString());
		System.out.println("c1: " + c1.toString());
		System.out.println("c2: " + c2.toString());
		System.out.println("d1: " + d1.toString());
		System.out.println("d2: " + d2.toString());
	
	}

}

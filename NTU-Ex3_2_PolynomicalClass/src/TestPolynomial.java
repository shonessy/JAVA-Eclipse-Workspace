
public class TestPolynomial {

	public static void main(String[] args) {
		Polynomial pol1=new Polynomial(6, 2,-5,7);
		System.out.println("Pol1: " + pol1);
		//System.out.println(pol1.evaluate(5));
		
		Polynomial pol2=new Polynomial(7,4,1);
		System.out.println("Pol2: " + pol2);
		pol1.add(pol2);
		System.out.println("Pol1=Pol1 + Pol2: " + pol1);
		
		pol1.multiply(pol2);
		System.out.println("Pol1=Pol1*Pol2: " + pol1);
		System.out.println("Pol2: " + pol2);
	}

}

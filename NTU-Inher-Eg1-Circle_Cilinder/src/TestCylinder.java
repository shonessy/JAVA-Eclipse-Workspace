
public class TestCylinder {

	public static void main(String[] args) {
		Circle c1=new Circle(5);
		Cylinder cl1=new Cylinder(10, c1);
		
		System.out.println("C1: " + c1);
		System.out.println("CL1: " + cl1);
		
		System.out.println("P(c1):" + c1.getArea());
		System.out.println("P(cl1): " + cl1.getArea());
		
		System.out.println("V(cl1): " + cl1.getVolume());
		
	}

}

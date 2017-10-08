
public class Test {

	public static void main(String[] args) {
		Circle c1=new Circle(5);
		System.out.println("C1: " + c1);
		System.out.println("P(c1)= " + c1.getArea());
		System.out.println();
		
		Cylinder cl1=new Cylinder(c1, 8);
		System.out.println("CL1: " + cl1);
		System.out.println("P(cl1)= " + cl1.getArea());
		System.out.println("V(cl1)= " + cl1.getVolume());
		System.out.println();
		
		cl1.setColor("Blue");
		System.out.println(cl1);
		System.out.println(c1);		//menja se boja i c1
									//ako base==circle;
									//ne menja se boja
									//ako konstruktor kopije
	}

}


public class CircleTest {

	public static void main(String[] args) {
		Circle c0=new Circle();
		Circle c1=new Circle(new Point(4,3), 5);
		System.out.println(c0);
		System.out.println(c1);
		
		System.out.println("P(c1)= " + c1.getArea());
		System.out.println("O(c1)= " + c1.getCurcumference());
		System.out.println("C1->C0: " + c1.distance(c0));
	}

}

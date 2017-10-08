
public class TestShapes {

	public static void main(String[] args) {
		Shape s0=new Shape();
		Shape s1=new Shape("Blue", false);
		System.out.println("S0: " + s0);
		System.out.println("S1: " + s1);
		
		Circle c1=new Circle("Green", true, 2.4);
		System.out.println("C1: " + c1);
		System.out.println("O(c1): " + c1.getPerimeter());
		System.out.println("P(c1): " + c1.getArea());
		
		System.out.println();
		Rectangle r1=new Rectangle(8,6);
		System.out.println(r1);
		
		System.out.println();
		Square sq1=new Square(4, "Yellow", false);
		System.out.println(sq1);
		System.out.println("O(sq1): " + sq1.getPerimeter());
		System.out.println("P(sq1): " + sq1.getArea());
		System.out.println();
		
		sq1.setSide(5);
		System.out.println(sq1);
		System.out.println("O(sq1): " + sq1.getPerimeter());
		System.out.println("P(sq1): " + sq1.getArea());
		System.out.println();
		
		sq1.setLength(6);
		System.out.println(sq1);
		System.out.println("O(sq1): " + sq1.getPerimeter());
		System.out.println("P(sq1): " + sq1.getArea());
		System.out.println();
		
		sq1.setWidth(7);
		System.out.println(sq1);
		System.out.println("O(sq1): " + sq1.getPerimeter());
		System.out.println("P(sq1): " + sq1.getArea());
		System.out.println();
		
		
		
		
		
		
	}

}

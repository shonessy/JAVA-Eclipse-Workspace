
public class Test {

	public static void main(String[] args) {
		Circle c1=new Circle(3.0);
		System.out.println("P(c1)=" + c1.getArea());
		System.out.println("O(c1)=" + c1.getPerimeter());
		System.out.println();
		
		ResizableCircle rc1=new ResizableCircle(3.0);
		System.out.println("P(rc1)=" + rc1.getArea());
		System.out.println("O(rc1)=" + rc1.getPerimeter());
		System.out.println();
		
		rc1.resize(10);
		System.out.println("P(rc1)=" + rc1.getArea());
		System.out.println("O(rc1)=" + rc1.getPerimeter());
		System.out.println();
		
		c1=rc1;
		System.out.println("P(c1)=" + c1.getArea());
		System.out.println("O(c1)=" + c1.getPerimeter());
		System.out.println();
		
	}

}

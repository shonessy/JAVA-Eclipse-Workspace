
public class TestTriangle {

	public static void main(String[] args) {
		Point A=new Point(2,3);
		Point B=new Point(5,4);
		Point C=new Point(7,2);
		Triangle t1=new Triangle(A, B, C);
		System.out.println(t1);
		System.out.println("T1 Obim: " + t1.getPerimeter());
		System.out.println(t1.getType());
		
		Triangle t2=new Triangle(new Point(0,0),
								 new Point(3,4),
								 new Point(6,0));
		System.out.println("T2 Obim: " + t2.getPerimeter());
		System.out.println(t2.getType());
		
		Triangle t3=new Triangle(0,0,4,3,8,0);
		System.out.println("T3 Obim: " + t3.getPerimeter());
		System.out.println(t3.getType());
	}

}

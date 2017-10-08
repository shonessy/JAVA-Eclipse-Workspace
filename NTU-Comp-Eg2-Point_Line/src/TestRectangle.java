
public class TestRectangle {

	public static void main(String[] args) {
		Point A=new Point(2,3);
		Point C=new Point(5,1);
		Rectangle r1=new Rectangle(A,C);
		System.out.println(r1);
		System.out.println("Obim: " + r1.getPerimeter());
		System.out.println("Povrsina: " + r1.getArea());
		
		
	}

}

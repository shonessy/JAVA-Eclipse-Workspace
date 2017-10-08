
public class TestTwoDShape {

	public static void main(String[] args) {
		TwoDShape td1=new TwoDShape(7.8, 5.4);
		System.out.println("*td1.toString: ");
		System.out.println("2DShape: " + td1);
		System.out.println();
		
		Triangle t1=new Triangle(5,4,"Jednakostranicni");
		System.out.println("*t1.toString: ");
		System.out.println(t1);
		System.out.println();
		
		System.out.println("*td1.getArea(): ");
		System.out.println("Povrsina 2D: " + td1.getArea() + "\n");
		
		System.out.println("*t1.getArea(): ");
		System.out.println("Povrsina t1: " + t1.getArea() + "\n");
		
		td1=t1;
		System.out.println("Povrsina (td1<=t1).getArea(): " + td1.getArea() + "\n");
		


	}

}

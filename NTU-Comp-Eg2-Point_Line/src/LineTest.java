
public class LineTest {

	public static void main(String[] args) {
		Line l1=new Line(2,4,5,7);
		Line l2=new Line(new Point(5,7), new Point(4,2));
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l1.getLength());
		l1.setBeginXY(0, 0);
		l1.setEndXY(4, 3);
		System.out.println(l1.getLength());
		
	}

}

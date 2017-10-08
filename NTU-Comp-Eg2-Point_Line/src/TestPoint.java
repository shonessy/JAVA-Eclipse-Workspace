
public class TestPoint {

	public static void main(String[] args) {
		
		Point p0=new Point();
		Point p1=new Point(4,5);
		
		// test toString
		System.out.println("P0" + p0);
		System.out.println("P1" + p1);
		
		//test distance
		System.out.println("P1->0: " + p1.distance());
		System.out.println("P1->P0 " + p1.distance(p0));
		System.out.println("P0->(4,5) " + p0.distance(4, 5));
		
		Point ps[]=new Point[10];
		for(int i=1; i<=10; i++)
			ps[i-1]=new Point(i,i);
		
		System.out.println("10 tacaka :");
		for(Point p : ps)
			System.out.print(p + "\t");
		
		
	}

}

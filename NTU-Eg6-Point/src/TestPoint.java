
public class TestPoint {

	public static void main(String[] args) {
		Point p0=new Point();
		Point p1=new Point(4,5);
		
		System.out.printf("P1-0: %.2f\n", p1.distance());
		System.out.printf("P1-P0: %.2f\n", p1.distance(p0));
		System.out.printf("P1-(2,3): %.2f\n", p1.distance(2, 3));
		
		System.out.println("P1x: " + p1.getXY()[0] + 
							"\tP1y: " + p1.getXY()[1]);
		
	}

}

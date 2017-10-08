
public class Test {

	public static void main(String[] args) {
		Point begin=new Point(0,0);
		Point end=new Point(3,4);
		Line l1=new Line(begin, end);
		System.out.println("L1: " + l1);
		System.out.println(l1.getLength());
		System.out.println(l1.getBeginX());
		
	}

}

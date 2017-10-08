
public class Test2D3DPoint {

	public static void main(String[] args) {
		Point2D p2d=new Point2D(5,4);
		System.out.println(p2d);
		Point3D p3d=new Point3D(7,8,5);
		System.out.println(p3d);
		
		Point2D p2d_1=p3d;
		System.out.println(p2d_1);
	}

}

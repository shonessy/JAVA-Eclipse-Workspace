
public class ShapesDemo {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		Triangle t2=new Triangle(5);
		Triangle t3=new Triangle(5, 8, "outlined");
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(2.5);
		Rectangle r3=new Rectangle(4,3.5);
		
		//triangles
		System.out.println("T1 info: ");
		t1.showDimensions();
		t1.showStyle();
		System.out.println("T1 povrsina: " + t1.area() + "\n" );
		
		System.out.println("T2 info: ");
		t2.showDimensions();
		t2.showStyle();
		System.out.println("T1 povrsina: " + t2.area() + "\n" );
		
		System.out.println("T3 info: ");
		t3.showDimensions();
		t3.showStyle();
		System.out.println("T3 povrsina: " + t3.area()  );
		System.out.println("-------------------------------------------\n");
		
		//rectangulars
		System.out.println("R1 info: ");
		r1.showDimensions();
		if( r1.isSquare() ) 
			System.out.println("Jeste kvadrat") ;
		else
			System.out.println("Nije kvadrat");
		System.out.println("R1 povrsina: " + r1.area() + "\n" );
		
		System.out.println("R2 info: ");
		r2.showDimensions();
		if( r2.isSquare() ) 
			System.out.println("Jeste kvadrat") ;
		else
			System.out.println("Nije kvadrat");
		System.out.println("R2 povrsina: " + r2.area() + "\n" );
		
		System.out.println("R3 info: ");
		r3.showDimensions();
		if( r3.isSquare() ) 
			System.out.println("Jeste kvadrat") ;
		else
			System.out.println("Nije kvadrat");
		System.out.println("R3 povrsina: " + r3.area() + "\n" );

	}

}

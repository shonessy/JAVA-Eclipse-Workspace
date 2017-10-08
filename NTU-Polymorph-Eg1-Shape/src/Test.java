
public class Test {

	public static void main(String[] args) {
		Shape s1;
		Rectangle r1=new Rectangle(5, 4, "Red", true);
		System.out.println(r1);
		System.out.println("P(r1)= " + r1.getArea() + "\n");
		
		Triangle t1=new Triangle("Blue", false, 3, 7);
		System.out.println(t1);
		System.out.println("P(t1)=" + t1.getArea() + "\n");
		
		s1=r1;
		System.out.println("C(s1=r1): " + s1.getColor() + "\n");
		
		s1=t1;
		System.out.println("P(s1=t1)= " + s1.getArea() + "\n");
		
		Shape s2=new Rectangle(4, 8, "Yellow", false);
		System.out.println(s2);
		/////////////////////////////////
		
		/*	SVA LOGIKA I SMISAO POLIMORFIZMA */
		System.out.println("\n*********\n");
		Shape shapes[]=new Shape[3];
		shapes[0]=new Triangle("Blue", true, 5, 9);
		shapes[1]=new Rectangle(4, 8, "Yellow", false);
		shapes[2]=new Triangle("Blue", true, 3, 7);
		for(Shape s : shapes){
			System.out.println(s.toString());
			System.out.println("P= " + s.getArea());
			System.out.println();
			}
		//kasnije dodamo klasu Circle i 
		//for each i dalje radi
		
		
		
	}

}

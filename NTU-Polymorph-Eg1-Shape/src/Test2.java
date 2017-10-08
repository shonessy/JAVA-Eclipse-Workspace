
public class Test2 {
	public static void main(String args[]){
		Shape s1=new Circle(7.4);
		System.out.println(s1);
		System.out.println("P=" + s1.getArea());
		System.out.println("O=" + s1.getPerimeter());
		System.out.println();
		
		//downcast 1 stepen
		Circle c1=(Circle)s1;
		System.out.println(s1);
		System.out.println("P=" + s1.getArea());
		System.out.println("O=" + s1.getPerimeter());
		System.out.println();
		
		
		Shape s2=new Square(8, "Blue", true);
		System.out.println(s2);
		System.out.println("P=" + s2.getArea());
		System.out.println("O=" + s2.getPerimeter());
		System.out.println();
		
		//downcast 2 stepen
		Square sq2=(Square)s2;
		System.out.println(sq2);
		System.out.println("P=" + sq2.getArea());
		System.out.println("O=" + sq2.getPerimeter());
		System.out.println();
		
		//Circle c2=(Circle)sq2;	//error
		
	}
}


public class Test {

	public static void main(String[] args) {
		MovablePoint mp1=new MovablePoint(2, 4, 3, 3);
		System.out.println(mp1);
		mp1.moveUp();
		System.out.println(mp1);
		mp1.moveLeft();
		System.out.println(mp1);
		mp1.moveDown();
		System.out.println(mp1);
		mp1.moveRight();
		System.out.println(mp1);
		System.out.println();
		
		MovableCircle mc1=new MovableCircle(7, 7, 3, 3, 5);
		System.out.println(mc1);
		mc1.moveUp();
		System.out.println(mc1);
		mc1.moveLeft();
		System.out.println(mc1);
		mc1.moveDown();
		System.out.println(mc1);
		mc1.moveRight();
		System.out.println(mc1);
		System.out.println();
		
		Movable mv1=new MovablePoint(4, 8, 1, 1);
		Movable mv2=new MovableCircle(1, 1, -1, -1, 5);
		System.out.println(mv1);
		System.out.println(mv2);
		mv2.moveLeft();
		mv2.moveDown();
		System.out.println(mv2);
		System.out.println();
		
		MovableRectangle mr1=new MovableRectangle(3, 3, 5, 5, 1, 1);
		System.out.println(mr1);
		System.out.println("P=" + mr1.getArea());
		System.out.println("O=" + mr1.getPerimeter());
		
		mr1.moveUp();
		System.out.println(mr1);
		System.out.println("P=" + mr1.getArea());
		System.out.println("O=" + mr1.getPerimeter());
		
		mr1.moveLeft();
		System.out.println(mr1);
		System.out.println("P=" + mr1.getArea());
		System.out.println("O=" + mr1.getPerimeter());
		
		mr1.moveDown();
		System.out.println(mr1);
		System.out.println("P=" + mr1.getArea());
		System.out.println("O=" + mr1.getPerimeter());
		
		mr1.moveRight();
		System.out.println(mr1);
		System.out.println("P=" + mr1.getArea());
		System.out.println("O=" + mr1.getPerimeter());
		
		
	}

}

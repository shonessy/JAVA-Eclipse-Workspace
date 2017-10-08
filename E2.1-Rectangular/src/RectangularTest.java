import java.awt.Graphics;

public class RectangularTest {

	public static void main(String[] args) {
		Rect r1=new Rect(1,1,3,5);
		Rect r2=new Rect(2,3,5,6);
		DrawableRect r3= new DrawableRect(3, 5, 2, 1);
				
		Rect u=r1.union(r2);
		Rect i=r1.intersection(r2);
		
		Graphics g;
		r3.draw(g);
		
		System.out.println("Union: " + u.toString());
		System.out.println("Intersection: " + i.toString());
		

	}

}

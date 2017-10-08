/*
 *	 A___________B
 *	 |		     |
 *	 |		     |	
 *	 |	  	     |
 *	 D___________C
 */
public class Rectangle {
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	
	//Constructors
	public Rectangle(Point A, Point C){
		this.A=A;
		this.C=C;
		B=new Point(C.getX(),A.getY());
		D=new Point(A.getX(), C.getY());
	}
	public Rectangle(int xA, int yA, int xC, int yC){
		A=new Point(xA, yA);
		C=new Point(xC, yC);
		B=new Point(C.getX(),A.getY());
		D=new Point(A.getX(), C.getY());
	}
	
	//toString
	public String toString(){
		return "Rectangle[A=" + A +
				", B=" + B +
				", C=" + C +
				", D=" + D + "]";
	}
	
	//Obim
	public double getPerimeter(){
		return A.distance(B)+B.distance(C)+
			   C.distance(D)+D.distance(A);
	}
	
	//Povrsina
	public double getArea(){
		return A.distance(B)*B.distance(C);
	}
	
	//Kvadrat ili pravougaonik	
	public String getType(){
		if(A.distance(B)==B.distance(C))
			return "Kvadrat";
		return "Pravougaonik";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

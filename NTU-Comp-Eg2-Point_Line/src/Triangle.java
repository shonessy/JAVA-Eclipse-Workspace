
public class Triangle {
	private Point A;
	private Point B;
	private Point C;
	
	//Constructors
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		A=new Point(x1,y1);
		B=new Point(x2, y2);
		C=new Point(x3, y3);
	}
	public Triangle(Point A, Point B, Point C){
		this.A=A;
		this.B=B;
		this.C=C;
	}
	
	//toString
	public String toString(){
		return "Triangle[A=" + A +  
				", B=" + B + 
				", C=" + C + "]";
	}
	
	//Obim
	public double getPerimeter(){
		return A.distance(B) + B.distance(C) + C.distance(A);
	}
	
	//jednakostranicni, jednakokraki ili raznostrani
	public String getType(){
		if(A.distance(B)==B.distance(C) && A.distance(B)==A.distance(C))
			return "Jednakostranicni";
		else if(A.distance(C)==B.distance(C) ||
				A.distance(B)==B.distance(C) ||
				A.distance(C)==A.distance(B))
			return "Jednakokraki";
		else
			return "Raznostrani";
	}
	
	
	
	
	
	
	
	
}

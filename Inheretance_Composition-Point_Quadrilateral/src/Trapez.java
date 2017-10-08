
public class Trapez extends Cetvorougao{
	
	//Constructors
	public Trapez(){
		super();
	}
	public Trapez(int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD){
		super(xA, yA, xB, yB, xC, yC, xD, yD);
	}
	public Trapez(Point A, Point B, Point C, Point D){
		super(A, B, C, D);
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Trapez je " + super.toString();
	}
	
	//Povrsina
	@Override
	public double area(){
		return getHeight()*(getA().distance(getB()) + getC().distance(getD()))/2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

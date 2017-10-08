/*
 *	 D___________C
 *	 |		     |
 *	 |		     |	
 *	 |	  	     |
 *	 A___________B
 */

public class Cetvorougao {
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	
	//Constructors
	public Cetvorougao(){
		A=new Point();
		B=new Point();
		C=new Point();
		D=new Point();
	}
	public Cetvorougao(int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD){
		A=new Point(xA, yA);
		B=new Point(xB, yB);
		C=new Point(xC, yC);
		D=new Point(xD, yD);
	}
	public Cetvorougao(Point A, Point B, Point C, Point D){
		this.A=A;
		this.B=B;
		this.C=C;
		this.D=D;
	}
		
	//Setters & Getters
	public Point getA(){
		return A;
	}
	public Point getB(){
		return B;
	}
	public Point getC(){
		return C;
	}
	public Point getD(){
		return D;
	}
	
	//toString
	@Override
	public String toString(){
		return "Cetvorougao[A" + A + ", B" + B + ", C" + C + ", D" + D + "]";
	}
	
	//Visina
	public double getHeight(){
		double kAB=((double)(A.getY()-B.getY()))/(A.getX()-B.getX());
		double kAD=((double)(A.getY()-D.getY()))/(A.getX()-D.getX());
		double alpha=Math.atan((kAB-kAD)/(1+kAB*kAD));
		System.out.println("kAB=" + kAB + " kAD=" + kAD + " alfa=" + alpha);
		return Math.abs(A.distance(D)*Math.sin(alpha));
	}
		
	//Duzina
	public double getLength(){
		return A.distance(B);
	}
		
	//Obim
	public double obim(){
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	//Povrsina -> must override, necemo abstract jer zelimo da iscrtamo nepravilini cetvorougao
	//a implementaciju povrsine mozemo dati posle
	public double area(){
		return -1.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

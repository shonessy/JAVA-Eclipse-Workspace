
public class Circle {
	private Point center;
	private double radius;
	
	//Constructors
	public Circle(){
		center=new Point();
		radius=0;
	}
	public Circle(int xCenter, int yCenter, double radius){
		center=new Point(xCenter, yCenter);
		this.radius=radius;
	}
	public Circle(Point center, double radius){
		this.center=center;
		this.radius=radius;
	}
	
	//Setters & Getters
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setCenter(Point center){
		this.center=center;
	}
	public Point getCenter(){
		return center;
	}
	public void setCenterX(int x){
		center.setX(x);
	}
	public int getCenterX(){
		return center.getX();
	}
	public void setCenterY(int y){
		center.setY(y);
	}
	public int getCenterY(){
		return center.getY();
	}
	public void setCenterXY(int x, int y){
		center.setXY(x, y);
	}
	public int[] getCenterXY(){
		return center.getXY();
	}
	
	//toString
	public String toString(){
		return "Circle[center=" + center + 
				", radius=" + radius + "]";
	}
	
	//calculate circle's area
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//calculate circle's curcumference
	public double getCurcumference(){
		return 2*radius*Math.PI;
	}
	
	//distance from another circle
	public double distance(Circle another){
		return center.distance(another.center);
	}
	
	
	
}

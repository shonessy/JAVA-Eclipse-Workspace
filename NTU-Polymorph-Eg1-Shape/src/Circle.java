
public class Circle extends Shape{
	private double radius;
	
	//Constructors
	public Circle(){
		super();
		radius=1.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius=radius;
	}
	
	//Setters & Getters
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}
	
	//toString
	@Override
	public String toString(){
		return "Circle r=" + radius + 
				" is a " + super.toString();
	}
	
	//Area
	@Override
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//Perimeter
	@Override
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	
	
	
	
	
	
	
	
	
	
}

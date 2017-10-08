
public class Circle extends Shape{
	private double radius;
	
	//Constructors
	public Circle(){
		super();
		radius=1.0;
	}
	public Circle(double radius){
		super();
		this.radius=radius;
	}
	public Circle(String color, boolean filled, double radius){
		super(color, filled);
		this.radius=radius;
	}
	
	//Setters & Getters
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	
	//Area
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//Obim
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	//toString
	@Override
	public String toString(){
		return String.format("A Circle with radius=%.2f," + 
							 " which is subclass of " + 
							 super.toString(), radius);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

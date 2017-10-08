
public class Circle {
	private double radius;
	private String color;
	
	//Constructors
	public Circle(){
		radius=1.0;
		color="red";
	}
	public Circle(double radius){
		this.radius=radius;
		this.color="red";
	}
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	public Circle(Circle circle){
		this.radius=circle.radius;
		this.color=circle.color;
	}
	
	//Setters & Getters
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	
	//toString
	@Override
	public String toString(){
		return "Circle[radius=" + radius + 
				", color=" + color + "]";
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	
	
	
	
	
	
	
	
	
	
}


public class Circle {
	private double radius;
	private String color;
	
	//Constructors
	public Circle(){
		radius=0;
		color="Red";
	}
	public Circle(double radius){
		this.radius=radius;
		color="Red";
	}
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	public Circle(Circle another){
		this.radius=another.radius;
		this.color=another.color;
	}
	
	//Setters & Getters
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	
	//toString
	@Override
	public String toString(){
		return "Circle[radius=" + radius + 
				", color=" + color + "]";
	}
	
	//Area
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	
	
	
	
	
	
	
	
}

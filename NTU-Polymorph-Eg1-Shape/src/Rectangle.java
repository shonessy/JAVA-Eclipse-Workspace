
public class Rectangle extends Shape {
	private double length,
				   width;
	
	//Constructors
	public Rectangle(){
		super();
		length=width=1.0;
	}
	public Rectangle(double length, double width){
		super();
		this.length=length;
		this.width=width;
	}
	public Rectangle(double length, double width, String color, boolean filled){
		super(color, filled);
		this.length=length;
		this.width=width;
	}
	
	//Getters & Setters
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getWidth(){
		return width;
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Rectangle[length=" + length + 
				", width=" + width + 
				"] is a " + super.toString();
	}
	
	//getArea
	@Override
	public double getArea(){
		return length*width; 
	}
	
	//Perimeter
	@Override
	public double getPerimeter(){
		return 2*(length + width);
	}
	
	
	
	
	
	
	
	
	
	
}

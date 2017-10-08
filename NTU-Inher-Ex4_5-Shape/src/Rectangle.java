
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	//Constructors
	public Rectangle(){
		super();
		width=1.0;
		length=1.0;
	}
	public Rectangle(double width, double length){
		super();
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width=width;
		this.length=length;
	}
	
	//Getters & Setters
	public void setWidth(double width){
		this.width=width;
	}
	public double getWidth(){
		return width;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	
	//Area
	public double getArea(){
		return width*length;
	}
	
	//Obim
	public double getPerimeter(){
		return 2*(width+length);
	}
	
	//toString
	@Override
	public String toString(){
		return "A Rectangle with width=" + width +
				" and length=" + length + 
				", which is a subclass of " + super.toString();
				
	}
	
	
	
	
	
	
	
	
}

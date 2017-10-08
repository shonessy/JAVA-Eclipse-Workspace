
public class Cylinder extends Circle{
	private double height;
	
	//Constructors
	public Cylinder(){
		super();
		height=0.0;
	}
	public Cylinder(double height){
		super();
		this.height=height;
	}
	public Cylinder(double height, double radius){
		super(radius);
		this.height=height;
	}
	public Cylinder(double height, double radius, String color){
		super(radius, color);
		this.height=height;
	}
	public Cylinder(double height, Circle circle){
		super(circle);
		this.height=height;
	}
	
	//Setters & Getters
	public double getHeigth(){
		return height;
	}
	public void setHeigth(double heigth){
		this.height=heigth;
	}
	
	//toString
	@Override
	public String toString(){
		return "Cylinder: height=" + height + 
				" Base: " + super.toString();
	}
	
	//area
	@Override
	public double getArea(){
		return 2*super.getArea() + 
			   2*super.getRadius()*Math.PI*height;
	}
	
	//Volume
	public double getVolume(){
		return height*super.getArea();
	}
	
	
	
	
	
	
	
	
	
	
}

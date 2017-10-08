
public class Triangle extends Shape{
	private double base,
				   height;
	
	//Constructopr
	public Triangle(){
		super();
		base=height=1.0;
	}
	public Triangle(double base, double height){
		super();
		this.base=base;
		this.height=height;
	}
	public Triangle(String color, boolean filled, int base, int height){
		super(color, filled);
		this.base=base;
		this.height=height;
	}
	
	//setters & Getters
	
	//toSTring
	@Override
	public String toString(){
		return "Triangle[base=" + base + 
				", height= " + height +
				"] is a " + super.toString();
	}
	
	//area
	@Override
	public double getArea(){
		return (double)base*height/2;
	}
	
	//Perimeter
	@Override
	public double getPerimeter(){
		return -1.0;
	}
}

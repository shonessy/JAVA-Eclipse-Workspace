
public class Cylinder {
	private Circle base;
	private double height;
	
	//Constructors
	public Cylinder(){
		base=new Circle();
		height=1.0;
	}
	public Cylinder(double radius){
		base=new Circle(radius);
		height=1.0;
	}
	public Cylinder(double radius, double height){
		base=new Circle(radius);
		this.height=height;
	}
	public Cylinder(double radius, double height, String color){
		base=new Circle(radius, color);
		this.height=height;
	}
	public Cylinder(Circle circle, double height){
		//base=circle;			//promjena boje cilindra 
								//menja i boju kruga
		
		base=new Circle(circle);	//promjena boje cilindra
									//ne menja boju kruga
		this.height=height;
	}
	
	//Setters & Getters
	public void setRadius(double radius) {
		base.setRadius(radius);
	}
	public double getRadius() {
		return base.getRadius();
	}
	public void setColor(String color) {
		base.setColor(color);
	}
	public String getColor() {
		return base.getColor();
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public Circle getBase() {
		return base;
	}
	public void setBase(Circle circle) {
		base=circle;
	}
	
	//tosTring
	@Override
	public String toString(){
		return "Cylinder with height=" + height +
				" and Base: " + base;
	}
	
	//Area
	public double getArea(){
		return 2*base.getArea()+2*base.getRadius()*Math.PI;
	}
	
	//Volume
	public double getVolume(){
		return base.getArea()*height;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

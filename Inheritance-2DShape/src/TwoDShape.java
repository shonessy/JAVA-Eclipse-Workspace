
public class TwoDShape {
	private double width;
	private double height;
	
	//Constructors
	public TwoDShape(){
		width=0.0;
		height=0.0;
	}
	public TwoDShape(double width, double height){
		this.width=width;
		this.height=height;
	}
	public TwoDShape(TwoDShape tds){
		this.width=tds.width;
		this.height=tds.height;
	}
	
	//Setters & Getters
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	
	//toString
	public String toString(){
		return String.format("[w=%.2f, h=%.2f]", width, height);
	}
	
	public double getArea(){
		System.out.println("Area() in TwoDShape mora biti overriden");
		return -1.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


public abstract class Shape {
	private String color;
	boolean filled;
	
	//Constructor
	public Shape(){
		color="white";
		filled=false;
	}
	public Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	//Setters & Getters
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public boolean isFilled(){
		return this.filled;
	}
	
	//toSTring
	@Override
	public String toString(){
		return "Shape[color=" + color + 
				" filled=" + filled + "]";
	}
	
	//Area
	public abstract double getArea();
	
	//Perimeter
	public abstract double getPerimeter();
	
}

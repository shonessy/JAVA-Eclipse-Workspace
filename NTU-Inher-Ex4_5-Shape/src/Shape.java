
public class Shape {
	private String color;
	private boolean filled;
	
	//Constructors
	public Shape(){
		color="red";
		filled=true;
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
		return color;
	}
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	public boolean isFilled(){
		return filled;
	}
	
	//toSTring
	@Override
	public String toString(){
		String ret="A Shape with color of " + color +
				   " and ";
		ret+=(filled) ? "filled" : "Not Filled";
		return ret;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

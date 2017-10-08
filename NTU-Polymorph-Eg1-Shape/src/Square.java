
public class Square extends Rectangle{
	
	//Constructors
	public Square(){
		super();
	}
	public Square(double side){
		super(side, side);
		setLength(side);
		setWidth(side);
	}
	public Square(double side, String color, boolean filled){
		super(side, side, color, filled);
		setLength(side);
		setWidth(side);
	}
	
	//Setters & Getters
	public void setSide(double side){
		setLength(side);
		setWidth(side);
	}
	public double getSide(){
		return getLength();
	}
	
	//ToString
	@Override
	public String toString(){
		return "Square is " + super.toString();
	}
}

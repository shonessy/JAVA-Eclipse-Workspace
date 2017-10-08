
public class Triangle extends TwoDShape{
	String type;
	
	//Constructors
	public Triangle(double width, double height, String type){
		super(width, height);
		this.type=type;
	}
	public Triangle(Triangle T1){
		super(T1);
		type=T1.type;
	}
	
	//Setters & Getters
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	
	//toString
	public String toString(){
		return "Trougao" + super.toString();
	}
	
	//Povrsina override
	@Override
	public double getArea(){
		//double sum=width;			//postoji ali nije vidljiv
		//double sum=super.width;	//postoji ali nije vidljiv
		return super.getHeight()*super.getWidth()/2;
	}
	
}

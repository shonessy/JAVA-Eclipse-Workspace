
public class Rectangle extends TwoDShape{
	
	//constructors
	Rectangle() {
		super();
		}
	Rectangle(double x){
		super(x);
		}
	Rectangle(double x, double y){
		super(x,y);
		}
	
	double area(){
		return getWidth()*getHeight();
		}
	
	boolean isSquare(){
		if( getWidth()==getHeight() )
			return true;
		return false;
		}
	
}

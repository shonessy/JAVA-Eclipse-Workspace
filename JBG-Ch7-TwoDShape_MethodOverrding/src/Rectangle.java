
public class Rectangle extends TwoDShape{
	
	Rectangle() {
		super();
		}
	
	Rectangle(double x){
		super(x, "Rectangle");
		}
	
	Rectangle(double w, double h){
		super(w, h, "Rectangle");
		}
	
	Rectangle(Rectangle a){
		super(a);
		}
	
	//override method
	double area(){
		return getWidth()*getHeight();
		}
	
	boolean isSquare(){
		return (getWidth()==getHeight()) ? true : false;
		}
	
}
